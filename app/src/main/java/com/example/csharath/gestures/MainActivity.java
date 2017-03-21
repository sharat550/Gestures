package com.example.csharath.gestures;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener
{
    private TextView textView;
    private GestureDetectorCompat mDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiate the gesture detector with the
        // application context and an implementation of
        // GestureDetector.OnGestureListener
        textView=(TextView) findViewById(R.id.textView2);
        mDetector = new GestureDetectorCompat(this,this);
        // Set the gesture detector as the double tap
        // listener.
        mDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent)
    {
        textView.setText("OnSingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent)
    {
        textView.setText("OnDoubleTap");

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent)
    {
        textView.setText("OnDoubleTapEvent");

        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent)
    {
        textView.setText("OnDown");

        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent)
    {
        textView.setText("OnShowPress");


    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent)
    {
        textView.setText("OnSingleTapUp");

        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1)
    {
        textView.setText("OnScroll");

        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent)
    {
        textView.setText("OnLongPress");


    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1)
    {
        textView.setText("OnFlinG");

        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);

        return super.onTouchEvent(event);
    }


private void sample()
{

}

}
