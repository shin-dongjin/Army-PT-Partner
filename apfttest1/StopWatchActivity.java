package dj.apps.apfttest1;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class StopWatchActivity extends Activity {
    TextView myOutput;
    TextView myRec1, myRec2;
    Button myBtnStart;
    Button myBtnRec;
    ImageButton homebtn;
    final static int Init =0;
    final static int Run =1;
    final static int Pause =2;

    int cur_Status = Init;
    int myCount=1;
    long myBaseTime;
    long myPauseTime;

    String str1, str2;

    private AnimationDrawable aniFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stopwatch);

        ImageView imageView = (ImageView) findViewById( R.id.twoMileImageView );
        imageView.setBackgroundResource( R.drawable.arrow_animation_ru );
        aniFrame = (AnimationDrawable) imageView.getBackground();

        myOutput = (TextView) findViewById(R.id.time_out);
        myRec1 = (TextView) findViewById(R.id.record1);
        myRec2 = (TextView) findViewById(R.id.record2);
        myBtnStart = (Button) findViewById(R.id.btn_start);
        myBtnRec = (Button) findViewById(R.id.btn_rec);

        homebtn = (ImageButton)findViewById( R.id.button_menu );
        homebtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        } );

    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    public void myOnClick(View v){
        switch(v.getId()){
            case R.id.btn_start:
                switch(cur_Status){
                    case Init:
                        myBaseTime = SystemClock.elapsedRealtime();
                        System.out.println(myBaseTime);
                        myTimer.sendEmptyMessage(0);
                        myBtnStart.setText("STOP");
                        myBtnRec.setEnabled(true);
                        cur_Status = Run;
                        aniFrame.start();
                        break;
                    case Run:
                        Log.i( "run", "run" );
                        myTimer.removeMessages(0);
                        myPauseTime = SystemClock.elapsedRealtime();
                        myBtnStart.setText("START");
                        myBtnRec.setText("RESET");
                        cur_Status = Pause;
                        aniFrame.stop();
                        break;
                    case Pause:
                        Log.i( "pause", "pause" );
                        long now = SystemClock.elapsedRealtime();
                        myTimer.sendEmptyMessage(0);
                        myBaseTime += (now- myPauseTime);
                        myBtnStart.setText("STOP"); aniFrame.stop();
                        myBtnRec.setText("LAP");
                        cur_Status = Run;
                        aniFrame.start();
                        break;
                }
                break;
            case R.id.btn_rec:
                switch(cur_Status){
                    case Run:
                        str1 = myRec1.getText().toString();
                        str2 = myRec2.getText().toString();
                        while(myCount<=16) {
                            if (myCount <= 8) {
                                str1 += String.format( "%d. %s\n", myCount, getTimeOut() );
                                myRec1.setText( str1 );
                                myCount++; break;
                            } else {
                                str2 += String.format( "%d. %s\n", myCount, getTimeOut() );
                                myRec2.setText( str2 );
                                myCount++; break;
                            }
                        }

                        break;
                    case Pause:
                        myTimer.removeMessages(0);

                        myBtnStart.setText("START");
                        myBtnRec.setText("LAP");
                        myOutput.setText("00:00:00");

                        cur_Status = Init;
                        myCount = 1;
                        myRec1.setText("");
                        myRec2.setText("");
                        myBtnRec.setEnabled(false);
                        aniFrame.stop();
                        aniFrame.selectDrawable(0);
                        break;
                }
                break;
        }
    }

    Handler myTimer = new Handler(){
        public void handleMessage(Message msg){
            myOutput.setText(getTimeOut());


            myTimer.sendEmptyMessage(0);
        }
    };

    String getTimeOut(){
        long now = SystemClock.elapsedRealtime();
        long outTime = now - myBaseTime;
        String easy_outTime = String.format("%02d:%02d:%02d", outTime/1000 / 60, (outTime/1000)%60,(outTime%1000)/10);
        return easy_outTime;
    }


}

