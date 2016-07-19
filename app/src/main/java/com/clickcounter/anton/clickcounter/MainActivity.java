package com.clickcounter.anton.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mtvCounter;
    private Button clickMeBtn;
    int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtvCounter = (TextView)findViewById(R.id.textView);
        clickMeBtn = (Button)findViewById(R.id.clickButton);

        assert clickMeBtn != null;
        clickMeBtn.setOnClickListener(this);
    }

    public void incrementCounter(){

        mCounter++;
        mtvCounter.setText(mCounter + "");
    }

    @Override
    public void onClick(View view) {
        incrementCounter();
    }
}
