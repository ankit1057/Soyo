package com.soyo;

import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image);

            Display display = getWindowManager ().getDefaultDisplay ();
            Point size = new Point ();
            display.getSize (size);
            int width = size.x;
            int height = size.y;

            Log.e ("Width", "" + width);

           // width = (width / 2) - 30;
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(width,150);
           // imageView.setLayoutParams(params);



            // Log.e("height", "" + height);

        Handler mHandler = new Handler();
        Runnable run=new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        };
        mHandler.postDelayed(run, 5000);
    }
}
