package com.teamkarigor.jami.kheltekhelteshikhi;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by jami on 1/24/2016.
 */
public class benjon_2 extends Activity {

    Button arrow2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benjon2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        arrow2();


        final MediaPlayer b16=MediaPlayer.create(this,R.raw.to2);

        Button bs16 =(Button) this.findViewById(R.id.benjon16);

        bs16.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b16.start();

                                   }

                               }
        );

        final MediaPlayer b17=MediaPlayer.create(this,R.raw.tho2);

        Button bs17 =(Button) this.findViewById(R.id.benjon17);

        bs17.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b17.start();

                                   }

                               }
        );

        final MediaPlayer b18=MediaPlayer.create(this,R.raw.to2);

        Button bs18 =(Button) this.findViewById(R.id.benjon18);

        bs18.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b18.start();

                                   }

                               }
        );

        final MediaPlayer b19=MediaPlayer.create(this,R.raw.dho2);

        Button bs19 =(Button) this.findViewById(R.id.benjon19);

        bs19.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b19.start();

                                   }

                               }
        );

        final MediaPlayer b20=MediaPlayer.create(this,R.raw.n3);

        Button bs20 =(Button) this.findViewById(R.id.benjon20);

        bs20.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b20.start();

                                   }

                               }
        );

        final MediaPlayer b21=MediaPlayer.create(this,R.raw.po);

        Button bs21 =(Button) this.findViewById(R.id.benjon21);

        bs21.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b21.start();

                                   }

                               }
        );

        final MediaPlayer b22=MediaPlayer.create(this,R.raw.fo);

        Button bs22 =(Button) this.findViewById(R.id.benjon22);

        bs22.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b22.start();

                                   }

                               }
        );

        final MediaPlayer b23=MediaPlayer.create(this,R.raw.bo);

        Button bs23 =(Button) this.findViewById(R.id.benjon23);

        bs23.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b23.start();

                                   }

                               }
        );

        final MediaPlayer b24=MediaPlayer.create(this,R.raw.bho);

        Button bs24 =(Button) this.findViewById(R.id.benjon24);

        bs24.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b24.start();

                                   }

                               }
        );

        final MediaPlayer b25=MediaPlayer.create(this,R.raw.mo);

        Button bs25 =(Button) this.findViewById(R.id.benjon25);

        bs25.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b25.start();

                                   }

                               }
        );

        final MediaPlayer b26=MediaPlayer.create(this,R.raw.j2);

        Button bs26 =(Button) this.findViewById(R.id.benjon26);

        bs26.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b26.start();

                                   }

                               }
        );

        final MediaPlayer b27=MediaPlayer.create(this,R.raw.ro1);

        Button bs27 =(Button) this.findViewById(R.id.benjon27);

        bs27.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b27.start();

                                   }

                               }
        );

        final MediaPlayer b28=MediaPlayer.create(this,R.raw.lo);

        Button bs28 =(Button) this.findViewById(R.id.benjon28);

        bs28.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b28.start();

                                   }

                               }
        );

        final MediaPlayer b29=MediaPlayer.create(this,R.raw.sho1);

        Button bs29 =(Button) this.findViewById(R.id.benjon29);

        bs29.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b29.start();

                                   }

                               }
        );

        final MediaPlayer b30=MediaPlayer.create(this,R.raw.sho2);

        Button bs30 =(Button) this.findViewById(R.id.benjon30);

        bs30.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b30.start();

                                   }

                               }
        );

    }

    private void arrow2() {
        arrow2 = (Button) findViewById(R.id.arrow2);
        arrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(benjon_2.this, benjon_3.class);
                startActivity(intent);


            }


        });

    }
}
