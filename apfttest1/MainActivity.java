package dj.apps.apfttest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        loading();
    }
    public void btn1(View view){
        Intent intent1 = new Intent( this, TimerPuActivity.class );
        startActivity( intent1 );
    }
    public void btn2(View view){
        Intent intent2 = new Intent( this, TimerSuActivity.class );
        startActivity( intent2 );
    }
    public void btn3(View view){
        Intent intent3 = new Intent( this, StopWatchActivity.class );
        startActivity( intent3 );
    }
    public void btn4(View view){
        Intent intent4 = new Intent( this, CalculatorActivity.class );
        startActivity( intent4 );
    }
    public void loading(){
        Intent intent5 = new Intent( this, LoadingActivity.class );
        startActivity( intent5 );
    }
}
