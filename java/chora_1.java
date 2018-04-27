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
public class chora_1 extends Activity {
    Button c1, cp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chora1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        c1 = (Button) findViewById(R.id.pb1);
        cp = (Button) findViewById(R.id.pba);

        final MediaPlayer sound = MediaPlayer.create(this, R.raw.ha);


        c1.setOnClickListener(new View.OnClickListener() {
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
