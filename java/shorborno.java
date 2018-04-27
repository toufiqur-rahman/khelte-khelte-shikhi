package com.teamkarigor.jami.kheltekhelteshikhi;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shorborno extends second {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shorborno);
        final MediaPlayer S1=MediaPlayer.create(this,R.raw.a);

        Button ss =(Button) this.findViewById(R.id.one);

        ss.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       S1.start();

                                   }

                               }
        );




        final MediaPlayer S2=MediaPlayer.create(this,R.raw.b);

        Button ss1 =(Button) this.findViewById(R.id.two);

        ss1.setOnClickListener(new View.OnClickListener(){

                                  @Override
                                  public void onClick(View v) {
                                      S2.start();

                                  }

                              }
        );

        final MediaPlayer S3=MediaPlayer.create(this,R.raw.c);

        Button ss2 =(Button) this.findViewById(R.id.three);

        ss2.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S3.start();

                                   }

                               }
        );

        final MediaPlayer S4=MediaPlayer.create(this,R.raw.d);

        Button ss3 =(Button) this.findViewById(R.id.four);

        ss3.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S4.start();

                                   }

                               }
        );

        final MediaPlayer S5=MediaPlayer.create(this,R.raw.e);

        Button ss4 =(Button) this.findViewById(R.id.five);

        ss4.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S5.start();

                                   }

                               }
        );

        final MediaPlayer S6=MediaPlayer.create(this,R.raw.f);

        Button ss5 =(Button) this.findViewById(R.id.six);

        ss5.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S6.start();

                                   }

                               }
        );

        final MediaPlayer S7=MediaPlayer.create(this,R.raw.g);

        Button ss6 =(Button) this.findViewById(R.id.seven);

        ss6.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S7.start();

                                   }

                               }
        );

        final MediaPlayer S8=MediaPlayer.create(this,R.raw.h);

        Button ss7 =(Button) this.findViewById(R.id.eight);

        ss7.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S8.start();

                                   }

                               }
        );
        final MediaPlayer S9=MediaPlayer.create(this,R.raw.i);

        Button ss8 =(Button) this.findViewById(R.id.nine);

        ss8.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S9.start();

                                   }

                               }
        );

        final MediaPlayer S10=MediaPlayer.create(this,R.raw.j);

        Button ss9 =(Button) this.findViewById(R.id.ten);

        ss9.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S10.start();

                                   }

                               }
        );

        final MediaPlayer S11=MediaPlayer.create(this,R.raw.k);

        Button ss10 =(Button) this.findViewById(R.id.eleven);

        ss10.setOnClickListener(new View.OnClickListener(){

                                   @Override
                                   public void onClick(View v) {
                                       S11.start();

                                   }

                               }
        );

    }
}
