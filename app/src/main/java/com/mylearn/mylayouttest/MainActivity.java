package com.mylearn.mylayouttest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
//AppCompatActivity
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
}
