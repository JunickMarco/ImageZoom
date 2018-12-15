package com.aquino.zoom;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zoonIn = (Button) findViewById(R.id.button);
        Button zoonOut = (Button) findViewById(R.id.button2);

        final TouchImageView touch = (TouchImageView) findViewById(R.id.imageView);

        Bitmap bImage = BitmapFactory.decodeResource(this.getResources(), R.drawable.mapmanila);

        touch.setImageBitmap(bImage);

        touch.setMaxZoom(4f); //change the max level of zoom, default is 3f


        zoonIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                touch.zoomIn();
            }
        });


        zoonOut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                touch.zoomOut();
            }
        });

    }
}