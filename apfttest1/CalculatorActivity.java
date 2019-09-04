package dj.apps.apfttest1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CalculatorActivity extends AppCompatActivity {
    private Button btnAdd;
    private ImageButton menubtn, resultBtn, btnView, btnReset;
    int pScore, sScore, rScore, ageInt;
    DatabaseHelper myDB;
    private int[] scores;
    private ListViewAdapter adapter;
    private ListView listview;
    private TextView ageText, puText, suText, minText, secText;
    private RadioButton genderM, genderF;
    Boolean flagPcheck, flagScheck, flagRcheck, flagGcheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.calculator );
        myDB = new DatabaseHelper( this );
        final boolean[] resultChecked = new boolean[1];
        final ImageButton btnAdd = (ImageButton) findViewById( R.id.saveBtn);

        resultBtn = (ImageButton) findViewById( R.id.resultBtn );
        resultBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view != null){
                    InputMethodManager imm = (InputMethodManager)getSystemService( Context.INPUT_METHOD_SERVICE );
                    imm.hideSoftInputFromWindow( view.getWindowToken(),0 );
                }
                MyResult result = new MyResult();
                 pScore = 0;
                 sScore = 0;
                 rScore = 0;
                int totalScore = 0;

                Boolean flag = false;
                Boolean flagAcheck = ageCheck().getAgeResult();

                String pResult = null;
                String sResult = null;
                String rResult = null;
                String tResult = null;

                ArrayList<String> errorList = new ArrayList<String>();

                if (flagAcheck) {
                    result = calculate();
                    if(result != null) { resultChecked[0] = true; }
                    else{ resultChecked[0] = false; }
                    pScore = result.getpResult();
                    sScore = result.getsResult();
                    rScore = result.getrResult();
                    totalScore = pScore + sScore + rScore;
                    flag = result.getbResult();

                    flagGcheck = result.getGeResult();
                    flagPcheck = result.getPuResult();
                    flagScheck = result.getSuResult();
                    flagRcheck = result.getRuResult();

                    if(!flagAcheck){ errorList.add("*Age"); }
                    if(!flagGcheck){ errorList.add("*Gender"); }
                    if(!flagPcheck){ errorList.add("*Push Up"); }
                    if(!flagScheck){ errorList.add("*Sit Up"); }
                    if(!flagRcheck){ errorList.add("*2M Run"); }

                    if (pScore >= 60) { pResult = "PASS"; }
                        else { pResult = "FAIL"; }
                    if (sScore >= 60) { sResult = "PASS"; }
                        else { sResult = "FAIL"; }
                    if (rScore >= 60) { rResult = "PASS"; }
                        else { rResult = "FAIL"; }
                    if(pResult == "PASS" && sResult == "PASS" && rResult == "PASS" ){ tResult = "PASS"; }
                        else{ tResult = "FAIL"; }

                    ResultViewFragment resultViewFragment = (ResultViewFragment) getSupportFragmentManager().findFragmentById( R.id.fragment );

                    if (flagGcheck && flagPcheck && flagScheck && flagRcheck) {
                        resultViewFragment.changeFragmentTextView( "Push Up Score: " + pScore + " (" + pResult + ")"
                                + "\n\nSit Up Score: " + sScore + " (" + sResult + ")"
                                + "\n\n2Miles Run Score: " + rScore + " (" + rResult + ")"
                                + "\n\nTotal Score: " + totalScore + " (" + tResult + ")"  );
                        btnAdd.setVisibility( View.VISIBLE );
                    } else if(!flagGcheck){
                        resultViewFragment.changeFragmentTextView( "Check Again: \n[*Gender]");
                        findViewById( R.id.genderM ).setFocusable(true);
                        findViewById( R.id.genderM ).setFocusableInTouchMode(true);
                        findViewById( R.id.genderM ).requestFocus();
                        btnAdd.setVisibility( View.INVISIBLE );
                    } else {
                        resultViewFragment.changeFragmentTextView( "Check Again: \n" + errorList );
                        if(errorList.contains( "*Push Up" )){ findViewById( R.id.puText ).requestFocus(); }
                        else if(errorList.contains( "*Sit Up" )){ findViewById( R.id.suText ).requestFocus(); }
                        else{ findViewById( R.id.minText ).requestFocus();
                        btnAdd.setVisibility( View.INVISIBLE );}
                    }
                }else { //If ageText's value is wrong
                    ResultViewFragment resultViewFragment = (ResultViewFragment) getSupportFragmentManager().findFragmentById( R.id.fragment );
                    resultViewFragment.changeFragmentTextView( "Check Again: \n[*Age] (17 and higher)");
                    findViewById( R.id.ageText ).requestFocus();
                    btnAdd.setVisibility( View.INVISIBLE );
                }
            }
        } );
        replaceFragment();

        //To save the data
        btnAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyResult result = calculate();
                int pScore = result.getpResult();
                int sScore = result.getsResult();
                int rScore = result.getrResult();
                Log.i("result", "result: "+pScore+" "+sScore+" "+rScore);
                ageText = (TextView)findViewById( R.id.ageText );
                puText = (TextView)findViewById( R.id.puText );
                suText = (TextView)findViewById( R.id.suText );
                minText = (TextView)findViewById( R.id.minText );
                secText = (TextView)findViewById( R.id.secText );
                try {
                    int ageInt = Integer.parseInt( ageText.getText().toString() );
                    int puInt = Integer.parseInt( puText.getText().toString() );
                    int suInt = Integer.parseInt( suText.getText().toString() );
                    int mInt = Integer.parseInt( minText.getText().toString() );
                    int sInt = Integer.parseInt( secText.getText().toString() );

                    addData( pScore, sScore, rScore);
                    btnAdd.setVisibility( View.INVISIBLE );
                }catch(NumberFormatException nfe){
                    Toast.makeText( CalculatorActivity.this, "Save Failed! \nPlease Get Your Result First!", Toast.LENGTH_SHORT ).show();
                }
            }
        } );

        //To see the history records
        btnView = (ImageButton) findViewById( R.id.historyBtn );
        btnView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( CalculatorActivity.this, ViewListContents.class );
                startActivity( intent );
            }
        } );

        //To reset the page
        btnReset = (ImageButton)findViewById( R.id.resetBtn );
        btnReset.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ageText = (TextView)findViewById( R.id.ageText ); ageText.setText( "" ); ageText.requestFocus();
                genderM = (RadioButton)findViewById( R.id.genderM ); genderM.setChecked( false );
                genderF = (RadioButton)findViewById( R.id.genderF ); genderF.setChecked( false );
                puText = (TextView)findViewById( R.id.puText ); puText.setText( "" );
                suText = (TextView)findViewById( R.id.suText ); suText.setText( "" );
                minText = (TextView)findViewById( R.id.minText ); minText.setText( "" );
                secText = (TextView)findViewById( R.id.secText ); secText.setText( "" );
                ResultViewFragment resultViewFragment = (ResultViewFragment) getSupportFragmentManager().findFragmentById( R.id.fragment );
                resultViewFragment.changeFragmentTextView( "Check Your Result Here!" );
            }
        } );
        //To go back to menu page
        menubtn = (ImageButton) findViewById( R.id.button_menu );
        menubtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        } );
    }

    public void addData(int pScore, int sScore, int rScore){
        boolean insertData = myDB.addData(pScore, sScore, rScore);
        if(insertData){ Toast.makeText( this, "Successfully Saved", Toast.LENGTH_LONG ).show(); }
        else{ Toast.makeText( this, "Save Fail", Toast.LENGTH_LONG ).show(); }
    }

    private MyResult ageCheck(){
        Boolean flagA = false;
        EditText age = (EditText)findViewById( R.id.ageText );
        try{
            if (age.getText().toString().length() == 0) {
                flagA = false;
            } else if (Integer.parseInt( age.getText().toString() ) < 17) {
                flagA = false;
            } else {
                ageInt = Integer.parseInt( age.getText().toString() );
                flagA = true;
            }
        }catch(NumberFormatException nfe){ flagA = false; }

        MyResult myResult = new MyResult();
        myResult.setAgeCheck( ageInt, flagA );
        return myResult;
    }
    private MyResult calculate(){
        int puInt = -1, suInt = -1, pScore = -1, rScore = -1, minInt = -1, secInt = -1;

        Boolean flagP = false, flagS = false, flagR = false, flagG = false, flagT = false;

        RadioButton genderM = (RadioButton)findViewById( R.id.genderM );
        RadioButton genderF = (RadioButton)findViewById( R.id.genderF );

        EditText pushUp = (EditText)findViewById( R.id.puText );
        EditText sitUp = (EditText)findViewById( R.id.suText );
        EditText runMin = (EditText)findViewById( R.id.minText );
        EditText runSec = (EditText)findViewById( R.id.secText );

        if(!genderM.isChecked() && !genderF.isChecked()) {flagG = false;}
        else if(genderM.isChecked() && genderF.isChecked()) {flagG = false;}
        else{ flagG=true; }

        int ageInt = ageCheck().getAgeInt();
        Boolean ageFlag = ageCheck().getAgeResult();

        try {
            if(pushUp.getText().toString().length()==0) {flagP = false;} //TODO PLEASE CHECK HERE
            else if (Integer.parseInt( pushUp.getText().toString() ) < 0) { flagP = false; }
            else {puInt = Integer.parseInt( pushUp.getText().toString()); flagP = true;}
        }catch(NumberFormatException nfe){ flagP = false; }
        try {
            if(sitUp.getText().toString().length()==0) { flagS = false;}
            else if(Integer.parseInt( sitUp.getText().toString()) < 0){flagS = false;}
            else {suInt = Integer.parseInt( sitUp.getText().toString()); flagS = true;}
        }catch(NumberFormatException nfe){ flagS = false; }

        try {
            if(runMin.getText().toString().length()==0){flagR = false;}
            else if(runMin.getText().toString().length()!=0){
                minInt = Integer.parseInt( runMin.getText().toString());
                if(minInt < 0 ) {flagR = false;}
                else{ flagR = true; }
            }
            if(runSec.getText().toString().length()==0){flagR = false;}
            else if(runSec.getText().toString().length()!=0){
                secInt = Integer.parseInt( runSec.getText().toString());
                if(secInt < 0 || secInt > 59) {flagR = false;}
                else{ flagR = true; }
            }
        }catch(NumberFormatException nfe){ flagR = false; }

        //Get Push Up Scores
        int[] pScores = pushUpCalculator(genderM, genderF, ageInt, puInt);
        if(genderM.isChecked() && !genderF.isChecked()){ pScore = pScores[0]; }
        if(!genderM.isChecked() && genderF.isChecked()){ pScore = pScores[1]; }

        //Get Sit Up Scores
        int sScore = sitUpCalculator(ageInt, suInt);

        //Get 2M Run Scores
        int[] rScores = runCalculator(genderM, genderF, ageInt, minInt, secInt);
            if(genderM.isChecked() && !genderF.isChecked()){ rScore = rScores[0]; }
            if(!genderM.isChecked() && genderF.isChecked()){ rScore = rScores[1]; }

        ImageButton saveBtn = (ImageButton)findViewById( R.id.saveBtn );
        if(ageFlag && flagP && flagS && flagR && flagG){
            flagT = true;
            saveBtn.setVisibility(View.VISIBLE);
        }else{
            //saveBtn.setVisibility(View.INVISIBLE);
        }

        MyResult myResult = new MyResult();
        myResult.setMyResult( pScore, sScore, rScore, flagT );
        myResult.setCalCheck( flagP, flagS, flagR, flagG );
        return myResult;
    }

    private int[] pushUpCalculator(RadioButton genderM, RadioButton genderF, int ageInt, int puInt){
        int[] scores = new int[2];
        MalePushUpCal mpuc = new MalePushUpCal();
        FemalePushUpCal fpuc = new FemalePushUpCal();

        //If the user is male
        if(genderM.isChecked() && !genderF.isChecked()){
            int mPuScore = mpuc.malePushUpCal(ageInt, puInt);
            scores[0] = mPuScore;
         //If the user is female
        }else if(genderF.isChecked() && !genderM.isChecked()){
            int fPuScore = fpuc.femalePushUpCal( ageInt, puInt );
            scores[1] = fPuScore;
        }
        return scores;
    }

    private int sitUpCalculator(int ageInt, int suInt) {
        SitUpCal suc = new SitUpCal();
        int suScore = suc.sitUpCal( ageInt, suInt );
        return suScore;
    }


    private int[] runCalculator(RadioButton genderM, RadioButton genderF, int ageInt, int minInt, int secInt){
        int[] scores = new int[2];
        MaleRunCal mrc = new MaleRunCal();
        FemaleRunCal frc = new FemaleRunCal();

        if(genderM.isChecked() && !genderF.isChecked()){
            int mRunScore = mrc.maleRunCal(ageInt, minInt, secInt);
            scores[0] = mRunScore;
        }else if(genderF.isChecked() && !genderM.isChecked()){
            int fRunScore = frc.femaleRunCal(ageInt, minInt, secInt);
            scores[1] = fRunScore;
        }
        return scores;
    }
    public void replaceFragment(){
        ResultViewFragment resultViewFragment = new ResultViewFragment();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace( R.id.fragment, resultViewFragment);
        fragmentTransaction.commit();
    }
}

class MyResult{
    private int pScore, sScore, rScore, ageInt;
    private Boolean flagAge, flagT, flagP, flagS, flagR,flagG;

    public void setMyResult(int pScore, int sScore, int rScore, Boolean flagT){
        this.pScore = pScore;
        this.sScore = sScore;
        this.rScore = rScore;
        this.flagT = flagT;
    }
    public void setAgeCheck(int ageInt, Boolean flagAge){
        this.ageInt = ageInt;
        this.flagAge = flagAge;
    }
    public void setCalCheck(Boolean flagP, Boolean flagS, Boolean flagR, Boolean flagG){
        this.flagP = flagP;
        this.flagS = flagS;
        this.flagR = flagR;
        this.flagG = flagG;
    }
    public int getpResult(){ return pScore; }
    public int getsResult(){ return sScore; }
    public int getrResult(){ return rScore; }
    public int getAgeInt(){ return ageInt; }

    public Boolean getbResult(){ return flagT; }
    public Boolean getAgeResult(){ return flagAge; }
    public Boolean getPuResult(){ return flagP; }
    public Boolean getSuResult(){ return flagS; }
    public Boolean getRuResult(){ return flagR; }
    public Boolean getGeResult(){ return flagG; }

}