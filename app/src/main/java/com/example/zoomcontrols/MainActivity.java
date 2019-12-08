package com.example.zoomcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    //declaring views
    Button button1;
    Button button2;
    ZoomControls zoomcontrol;
    ImageView star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViews();
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //demo the use of show() method
        zoomcontrol.show();
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //showing the demo of hide() method
            zoomcontrol.hide();
        }
    });
    //showing off the set on zoom click portion on the picture
    zoomcontrol.setOnZoomInClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //getting the image's X and Y on the screen
            float x = star.getScaleX();
            float y = star.getScaleY();
            // zoom in on picture
            star.setScaleX((float) (x + 2));
            star.setScaleY((float) (y + 2));
        }
    });

        //showing off the set on zoom click portion on the picture
        zoomcontrol.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting the image's X and Y on the screen
                float x = star.getScaleX();
                float y = star.getScaleY();
                // zoom out on picture
                star.setScaleX((float) (x - 2));
                star.setScaleY((float) (y - 2));
            }
        });

    }
    //simple methods that finds all the views
    private void findAllViews() {
    button1 = (Button) findViewById(R.id.button1);
    button2 = (Button) findViewById(R.id.button2);
    zoomcontrol = (ZoomControls) findViewById(R.id.zoomcontrol);
    star = (ImageView) findViewById(R.id.star);
    }
}
