package com.example.i.androidintenttest;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=(EditText) findViewById(R.id.edt);
        btn = (Button) findViewById(R.id.btn);
        // 响应按钮btn事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                Uri content_url = Uri.parse(edt.getText().toString());
                intent.setData(content_url);
                intent.setClassName("com.example.i.androidwebviewtest","com.example.i.androidwebviewtest.MainActivity");*/
                Intent intent = new Intent("android.intent.action.VIEW",Uri.parse(edt.getText().toString()));
                startActivity(intent);
            }
        });
    }

}
