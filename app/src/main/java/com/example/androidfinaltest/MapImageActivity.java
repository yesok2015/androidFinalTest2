package com.example.androidfinaltest;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MapImageActivity extends Activity {


    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapimageview);

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                dialogView = (View) View.inflate(MapImageActivity.this,R.layout.cat, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MapImageActivity.this);
                dlg.setTitle("탑승장소입니다.");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인", null);
                dlg.setNegativeButton("취소", null);
                dlg.show();
            }
        });

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                finish();
            }
        });


    }
}