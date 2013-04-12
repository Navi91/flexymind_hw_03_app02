package com.example.App02;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    DisplayMetrics displayMetrics = new DisplayMetrics();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);

        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }

    public void onChangePosition(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.topMargin = (int) (Math.random() * (displayMetrics.heightPixels - view.getHeight()));
        layoutParams.leftMargin = (int) (Math.random() * (displayMetrics.widthPixels - view.getWidth()));

        view.setLayoutParams(layoutParams);
    }


}
