package com.teamkarigor.jami.kheltekhelteshikhi;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by jami on 12/19/2015.
 */
public class second extends Activity {

    ImageButton srr;
    ImageButton brr;
    ImageButton crr;
    ImageButton prr;
    ImageButton mrr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        srr();
        brr();
        crr();
        prr();
        mrr();
    }

    private void srr() {
        srr = (ImageButton) findViewById(R.id.sr);
        srr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(second.this, shorborno.class);
                startActivity(intent);


            }


        });

    }
    private void brr() {
        brr = (ImageButton) findViewById(R.id.br);
        brr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(second.this, benjon.class);
                startActivity(intent);


            }


        });

    }
    private void crr() {
        crr = (ImageButton) findViewById(R.id.cr);
        crr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(second.this, chora.class);
                startActivity(intent);


            }


        });

    }
    private void prr() {
        prr = (ImageButton) findViewById(R.id.tt);
        prr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(second.this, Proshno.class);
                startActivity(intent);


            }


        });

    }

    private void mrr() {
        mrr = (ImageButton) findViewById(R.id.mm);
        mrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(second.this, Nepotthe.class);
                startActivity(intent);


            }


        });

    }


}

