package com.parag.basicservicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnStart, btnStop;
    TextView textView;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button)findViewById(R.id.btn_start);
        btnStop = (Button)findViewById(R.id.btn_stop);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        textView = (TextView)findViewById(R.id.txt_view);
        intent = new Intent(MainActivity.this, MyService.class);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_start: startService(intent); break;
            case R.id.btn_stop: stopService(intent); break;
            default: Toast.makeText(this, "Something went terribly wrong", Toast.LENGTH_SHORT).show();
        }
    }
}
