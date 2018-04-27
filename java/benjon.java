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
 * Created by jami on 12/20/2015.
 */
public class benjon extends Activity {

    Button arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benjon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        arrow();

        final MediaPlayer b1=MediaPlayer.create(this,R.raw.ko);

        Button bs1 =(Button) this.findViewById(R.id.benjon1);

        bs1.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b1.start();

                                   }

                               }
        );

        final MediaPlayer b2=MediaPlayer.create(this,R.raw.kho);

        Button bs2 =(Button) this.findViewById(R.id.benjon2);

        bs2.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b2.start();

                                   }

                               }
        );

        final MediaPlayer b3=MediaPlayer.create(this,R.raw.go);

        Button bs3 =(Button) this.findViewById(R.id.benjon3);

        bs3.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b3.start();

                                   }

                               }
        );

        final MediaPlayer b4=MediaPlayer.create(this,R.raw.gho);

        Button bs4 =(Button) this.findViewById(R.id.benjon4);

        bs4.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b4.start();

                                   }

                               }
        );

        final MediaPlayer b5=MediaPlayer.create(this,R.raw.n1);

        Button bs5 =(Button) this.findViewById(R.id.benjon5);

        bs5.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b5.start();

                                   }

                               }
        );

        final MediaPlayer b6=MediaPlayer.create(this,R.raw.co);

        Button bs6 =(Button) this.findViewById(R.id.benjon6);

        bs6.setOnClickListener(new View.OnClickListener(){

                                  @Override
                                  public void onClick(View v) {
                                      b6.start();

                                  }

                              }
        );

        final MediaPlayer b7=MediaPlayer.create(this,R.raw.cho);

        Button bs7=(Button) this.findViewById(R.id.benjon7);

        bs7.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b7.start();

                                   }

                               }
        );

        final MediaPlayer b8=MediaPlayer.create(this,R.raw.j1);

        Button bs8 =(Button) this.findViewById(R.id.benjon8);

        bs8.setOnClickListener(new View.OnClickListener() {

                                   @Override
                                   public void onClick(View v) {
                                       b8.start();

                                   }

                               }
        );

        final MediaPlayer b9=MediaPlayer.create(this,R.raw.jho);

        Button bs9 =(Button) this.findViewById(R.id.benjon9);

        bs9.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      b9.start();

                                  }

                              }
        );


        final MediaPlayer b10=MediaPlayer.create(this,R.raw.n2);

        Button bs10 =(Button) this.findViewById(R.id.benjon10);

        bs10.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      b10.start();

                                  }

                              }
        );

        final MediaPlayer b11=MediaPlayer.create(this,R.raw.to1);

        Button bs11 =(Button) this.findViewById(R.id.benjon11);

        bs11.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b11.start();

                                    }

                                }
        );

        final MediaPlayer b12=MediaPlayer.create(this,R.raw.tho);

        Button bs12 =(Button) this.findViewById(R.id.benjon12);

        bs12.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      b12.start();

                                  }

                              }
        );

        final MediaPlayer b13=MediaPlayer.create(this,R.raw.do1);

        Button bs13 =(Button) this.findViewById(R.id.benjon13);

        bs13.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b13.start();

                                    }

                                }
        );

        final MediaPlayer b14=MediaPlayer.create(this,R.raw.dho1);

        Button bs14 =(Button) this.findViewById(R.id.benjon14);

        bs14.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b14.start();

                                    }

                                }
        );

        final MediaPlayer b15=MediaPlayer.create(this,R.raw.n4);

        Button bs15 =(Button) this.findViewById(R.id.benjon15);

        bs15.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b15.start();

                                    }

                                }
        );


    }

    private void arrow() {
        arrow = (Button) findViewById(R.id.arrow1);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(benjon.this, benjon_2.class);
                startActivity(intent);


            }


        });

    }
}
