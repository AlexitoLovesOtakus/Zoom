package com.example.gwen.zoom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {



    private ImageView image;
    private ScaleGestureDetector detector;
    private GestureDetector gestureDetector;

    private  float xBegin=0;
    private  float yBegin=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.image);
        xBegin=image.getScaleX();
        yBegin=image.getScaleY();

        detector =new ScaleGestureDetector(this,new ScaleListener(image));
        gestureDetector =new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent){

        detector.onTouchEvent(motionEvent);
        gestureDetector.onTouchEvent(motionEvent);
        return  super.onTouchEvent(motionEvent);

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {

        Intent intent =new Intent(MainActivity.this,img2.class);
        startActivity(intent);
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {

        finishAffinity();

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {

        finishAffinity();
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
