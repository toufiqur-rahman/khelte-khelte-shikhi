package com.teamkarigor.jami.kheltekhelteshikhi;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


/**
 * Created by Yaseen on 1/30/2016.
 */
public class chora_3 extends Activity {
    Button c3, cp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chora3);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        c3 = (Button) findViewById(R.id.pb3);
        cp = (Button) findViewById(R.id.pba);

        final MediaPlayer sound = MediaPlayer.create(this, R.raw.am);


        c3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      sound.start();

                                  }

                              }
        );

        cp.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      sound.pause();

                                  }

                              }
        );


    }
}



