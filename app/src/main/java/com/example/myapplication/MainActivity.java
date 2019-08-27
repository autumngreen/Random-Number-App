package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    SeekBar seeker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // links vars to button and text
        txt = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);
        seeker = (SeekBar) findViewById(R.id.seekBar2);

        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView t=(TextView)findViewById(R.id.textView2);
                t.setText(String.valueOf(i));
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Random ran = new Random();
                int ranNum = ran.nextInt( seeker.getProgress());
                String s = String.valueOf(ranNum);
                txt.setText(s);
            }
        } );


    }
}
