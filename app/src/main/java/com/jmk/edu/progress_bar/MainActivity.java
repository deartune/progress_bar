package com.jmk.edu.progress_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    ProgressBar progressBar01;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        progressBar01=(ProgressBar)findViewById(R.id.progressBar01);
        progressBar01.setVisibility(View.GONE);
        }
        public void onClickWidget(View view){

        String text=toggleButton.getText()+"-"+toggleButton.isChecked();
            TextView tv =(TextView)findViewById(R.id.tv);
        if(toggleButton.isChecked()){
            progressBar01.setVisibility(View.VISIBLE);
           tv.setText(text.toString());}
        else
        { progressBar01.setVisibility(View.GONE);
           // Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
            tv.setText(text.toString());}
        }
    }

