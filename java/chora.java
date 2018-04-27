package com.teamkarigor.jami.kheltekhelteshikhi;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by jami on 12/20/2015.
 */

public class chora extends Activity {

    Button c1r;
    Button c2r;
    Button c3r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chora);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        c1r();
        c2r();
        c3r();

    }

    private void c1r() {
        c1r = (Button) findViewById(R.id.c1);
        c1r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(chora.this, chora_1.class);
                startActivity(intent);

            }

        });

    }

    private void c2r() {
        c2r = (Button) findViewById(R.id.c2);
        c2r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(chora.this, chora_2.class);
                startActivity(intent);

            }

        });

    }

    private void c3r() {
        c3r = (Button) findViewById(R.id.c3);
        c3r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(chora.this, chora_3.class);
                startActivity(intent);

            }

        });

    }

}