package com.teamkarigor.jami.kheltekhelteshikhi;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by jami on 2/14/2016.
 */
public class Proshno extends Activity {

    DatabaseHelper myDb;
    EditText editname,editfname,editmname;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proshno_uttor);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        myDb = new DatabaseHelper(this);
        ok = (Button)findViewById(R.id.in);
        editname = (EditText)findViewById(R.id.n2);
        editfname = (EditText)findViewById(R.id.n4);
        editmname = (EditText)findViewById(R.id.n6);
        AddData();
    }

    public void AddData(){
        ok.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editname.getText().toString(),
                                editfname.getText().toString(), editmname.getText().toString());

                        if (isInserted = true)
                            Toast.makeText(Proshno.this, "Data inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Proshno.this, "Data not inserted", Toast.LENGTH_LONG).show();

                    }
                }
        );
    }
}
