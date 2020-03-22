package com.example.rotationanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView arshadImage;
    Button fullScreenButton;
    boolean isScaleUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arshadImage = (ImageView) findViewById(R.id.imageViewArshad);
        fullScreenButton = (Button) findViewById(R.id.buttonFullScreen);
        isScaleUp = true;

        // setting X position
        arshadImage.setX(-2000);
        arshadImage.animate().translationXBy(2000).rotation(360).setDuration(2000);
    }

    public void buttonPressed(View v) {
        if (isScaleUp) {
            rotateScaleDown();
            isScaleUp = false;
        } else {
            rotateScaleUp();
            isScaleUp = true;
        }
    }

    void rotateScaleDown() {
        arshadImage.animate().rotation(3600).scaleX(0.1f).scaleY(0.1f).setDuration(2000);
    }

    void rotateScaleUp() {
        arshadImage.animate().rotation(-3600).scaleX(2.0f).scaleY(2.0f).setDuration(2000);
    }
}
