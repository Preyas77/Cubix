package com.example.cubix.cubix2d;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface Scene
{
    public void draw(Canvas canvas);
    public void update();
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
