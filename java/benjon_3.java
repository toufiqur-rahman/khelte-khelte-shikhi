package com.teamkarigor.jami.kheltekhelteshikhi;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by jami on 1/26/2016.
 */
public class benjon_3 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benjon3);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        final MediaPlayer b31=MediaPlayer.create(this,R.raw.sho3);

        Button bs31 =(Button) this.findViewById(R.id.benjon31);

        bs31.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b31.start();

                                    }

                                }
        );

        final MediaPlayer b32=MediaPlayer.create(this,R.raw.ho);

        Button bs32 =(Button) this.findViewById(R.id.benjon32);

        bs32.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b32.start();

                                    }

                                }
        );

        final MediaPlayer b33=MediaPlayer.create(this,R.raw.ro2);

        Button bs33 =(Button) this.findViewById(R.id.benjon33);

        bs33.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b33.start();

                                    }

                                }
        );

        final MediaPlayer b34=MediaPlayer.create(this,R.raw.ro3);

        Button bs34 =(Button) this.findViewById(R.id.benjon34);

        bs34.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b34.start();

                                    }

                                }
        );

        final MediaPlayer b35=MediaPlayer.create(this,R.raw.yo);

        Button bs35 =(Button) this.findViewById(R.id.benjon35);

        bs35.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b35.start();

                                    }

                                }
        );

        final MediaPlayer b36=MediaPlayer.create(this,R.raw.kto);

        Button bs36 =(Button) this.findViewById(R.id.benjon36);

        bs36.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b36.start();

                                    }

                                }
        );

        final MediaPlayer b37=MediaPlayer.create(this,R.raw.onusshar);

        Button bs37 =(Button) this.findViewById(R.id.benjon37);

        bs37.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b37.start();

                                    }

                                }
        );

        final MediaPlayer b38=MediaPlayer.create(this,R.raw.bisorgo);

        Button bs38 =(Button) this.findViewById(R.id.benjon38);

        bs38.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b38.start();

                                    }

                                }
        );

        final MediaPlayer b39=MediaPlayer.create(this,R.raw.chondro);

        Button bs39 =(Button) this.findViewById(R.id.benjon39);

        bs39.setOnClickListener(new View.OnClickListener() {

                                    @Override
                                    public void onClick(View v) {
                                        b39.start();

                                    }

                                }
        );

    }
}
