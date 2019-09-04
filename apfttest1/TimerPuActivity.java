package dj.apps.apfttest1;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import static android.speech.tts.TextToSpeech.ERROR;
import android.os.Handler;
import android.widget.Toast;

public class TimerPuActivity extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS = 123000;

    private TextView mTextViewCountDowm;
    private ImageButton mButtonStart, mButtonPause, mButtonReset, menubtn;

    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMills = START_TIME_IN_MILLIS;
    private AnimationDrawable aniFrame;

    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.timer_pushup );

        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {
                    tts.setLanguage(Locale.ENGLISH);
                    tts.setSpeechRate(0.7f);
                }
            }
        });

        mTextViewCountDowm = findViewById( R.id.text_view_countdown );
        mButtonStart = findViewById( R.id.button_start );
        mButtonPause = findViewById( R.id.button_pause );
        mButtonReset = findViewById( R.id.button_reset );
        menubtn = (ImageButton) findViewById( R.id.button_menu );

        ImageView imageView = (ImageView) findViewById( R.id.pushupImageView );
        imageView.setBackgroundResource( R.drawable.arrow_animation_pu );
        aniFrame = (AnimationDrawable) imageView.getBackground();

        mButtonStart.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int minutes = (int) (mTimeLeftInMills / 1000) / 60;
                int seconds = (int) (mTimeLeftInMills / 1000) % 60;

                //If the Timer is running
                if(!mTimerRunning){
                    if(minutes == 2 && seconds == 3){
                        tts.speak("GET READY!",TextToSpeech.QUEUE_FLUSH,null,null);
                        ImageView img= (ImageView) findViewById(R.id.message);
                        img.setImageResource(R.drawable.textbox2);
                        mTimerRunning = true;
                        startTimer();
                            //3 seconds of pause before offset
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable(){
                                public void run(){
                                    aniFrame.start();
                                    tts.speak("GO",TextToSpeech.QUEUE_FLUSH,null,null);
                                    ImageView img= (ImageView) findViewById(R.id.message);
                                    img.setImageResource(R.drawable.textbox3);
                                }
                            },3000);
                    }else{
                        mTimerRunning = true;
                        startTimer();
                        aniFrame.start();
                    }
                    mButtonReset.setVisibility( View.INVISIBLE );
                }else{
                    Toast.makeText( TimerPuActivity.this, "Timer is already Running!", Toast.LENGTH_SHORT ).show();
                }
            }
        } );

        mButtonPause.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCountDownTimer != null) {
                    mButtonStart.setClickable( true );
                    mCountDownTimer.cancel();
                    mTimerRunning = false;
                    aniFrame.stop();
                }else{}
                if(mTimerRunning){
                    mButtonReset.setVisibility( View.INVISIBLE );
                }else{
                    mButtonReset.setVisibility( View.VISIBLE );
                }
            }
        });

        mButtonReset.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img= (ImageView) findViewById(R.id.message);
                mTimeLeftInMills = START_TIME_IN_MILLIS;
//                mCountDownTimer = null;
                if(mCountDownTimer != null){
                    mCountDownTimer.cancel();
                }
                updateCountDownText();
                aniFrame.stop();
                aniFrame.selectDrawable( 0 );
                img.setImageResource(R.drawable.textbox);
            }
        } );
        updateCountDownText();

        menubtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTimerRunning = false;
//                mCountDownTimer = null;
//                if(mTimerRunning != false){
//                    finish();
//                    mCountDownTimer.cancel();
//                }
                if(tts != null) {
                    tts.stop();
                    tts.shutdown();
                }
                finish();
            }
        } );
    }

    private void startTimer(){
        mCountDownTimer = new CountDownTimer(mTimeLeftInMills, 1000) {
            ImageView img= (ImageView) findViewById(R.id.message);

            @Override
            public void onTick(long millisUntilFinished) {
                int minutes = (int) (mTimeLeftInMills / 1000) / 60;
                int seconds = (int) (mTimeLeftInMills / 1000) % 60;
                if(mCountDownTimer != null && mTimerRunning == true){
                    mTimeLeftInMills = millisUntilFinished;
                    updateCountDownText();
                    Log.i( "TIME", "MIN : SEC = "+minutes+" : "+seconds );
                    if(minutes==1 && seconds==1){
                        tts.speak("ONE MINUTE REMAINING",TextToSpeech.QUEUE_FLUSH,null,null);
                    }else if(minutes==0 && seconds==31){
                        tts.setSpeechRate(0.8f);
                        tts.speak("30 SECONDS REMAINING",TextToSpeech.QUEUE_FLUSH,null,null);
                    }else if(minutes==0 && seconds <= 11){
                        tts.setSpeechRate(0.7f);
                        String secString = Integer.toString( seconds-1 );
                        tts.speak(secString ,TextToSpeech.QUEUE_FLUSH,null,null);
                    }
                }
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
                aniFrame.stop();
                aniFrame.selectDrawable( 0 );
                img.setImageResource(R.drawable.textbox);
                tts.speak("FINISH",TextToSpeech.QUEUE_FLUSH,null,null);
                mTimeLeftInMills = START_TIME_IN_MILLIS;
                updateCountDownText();
                mButtonReset.setVisibility( View.VISIBLE );
            }
        }.start();
        if(mCountDownTimer != null) {
            mTimerRunning = true;
        }else{
            mCountDownTimer.cancel();
        }
    }

//    @Override
//    protected void onDestroy() {
//        mCountDownTimer.cancel();
//        super.onDestroy();
//    }

    private void updateCountDownText(){
        int minutes = (int) (mTimeLeftInMills / 1000) / 60;
        int seconds = (int) (mTimeLeftInMills / 1000) % 60;

        String timeLeftFormatted = String.format( Locale.getDefault(), "%02d:%02d", minutes, seconds);
        if(minutes == 2 && seconds != 0){
            mTextViewCountDowm.setText( "02:00" );
        }else{
            mTextViewCountDowm.setText( timeLeftFormatted );
        }
    }
}

