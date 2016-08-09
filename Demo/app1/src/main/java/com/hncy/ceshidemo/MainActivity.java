package com.hncy.ceshidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt(View v) {
        EditText et = (EditText)findViewById(R.id.et);
        et.setText("你好！");
        Toast.makeText(this, "你好！", Toast.LENGTH_LONG).show();
    }
}
