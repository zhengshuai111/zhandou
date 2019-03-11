package com.example.administrator.zhandou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Hello World!
     */
    private TextView mTtvvvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Log.i("TAG", "onCreate:--------222222222222 ");
        Log.i("TAg", "onCreate: ddfsfdfdfdsgggfdf");
    }

    private void initView() {
        //mTtvvvv = (TextView) findViewById(R.id.ttvvvv);
    }
}
