package com.bignerdranch.android.moonviewslide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ltt19 on 2017/9/28.
 */

public class CustomView extends View {
    private int lastX;
    private int lastY;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public boolean onTouchEvent(MotionEvent event) {
        //获取手指触摸点的横纵坐标
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                //计算移动距离
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                //调用layout方法来重新放置它的位置
                layout(getLeft() + offsetX,getTop() + offsetY,
                        getRight() + offsetX,getBottom() + offsetY);
                break;
        }
        return true;
    }
}
