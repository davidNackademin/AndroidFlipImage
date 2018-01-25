package com.example.david.thur25android;

//import android.widget.ImageView;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by david on 2018-01-25.
 */

public class FlipImage extends AppCompatImageView {
    int onDownImage;
    Drawable defaultImage;

    public FlipImage(Context context) {
        super(context);
        init();
    }

    public FlipImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FlipImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    void init() {
        defaultImage = getDrawable();
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getActionMasked();

        switch (action) {
            case ( MotionEvent.ACTION_DOWN )  :
               // Log.d("FlipImage", "DOWN") ;
                setImageResource(onDownImage);
                return true;
            case (MotionEvent.ACTION_UP) :
               // Log.d("FlipImage", "UP") ;
                setImageDrawable(defaultImage);
                return true;
        }

        return false;
    }
}
