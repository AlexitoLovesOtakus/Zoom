package com.example.gwen.zoom;

import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    private ImageView image;
    private float scale=1f;


    public ScaleListener(ImageView imageView){

        this.image=imageView;



    }

    public boolean onScale(ScaleGestureDetector detector) {
        scale=detector.getScaleFactor();
        image.setScaleX(scale);
        image.setScaleY(scale);

        return true;
    }
}
