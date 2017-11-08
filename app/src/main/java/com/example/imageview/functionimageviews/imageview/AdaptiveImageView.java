package com.example.imageview.functionimageviews.imageview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 *
 * 宽度全屏，高度自适应Imageview
 */
public class AdaptiveImageView extends AppCompatImageView {

    public AdaptiveImageView(Context context) {
        super(context);
    }

    public AdaptiveImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = getDrawable();
        if(null != drawable){
            int width = MeasureSpec.getSize(widthMeasureSpec);
            int height = (int) Math.ceil((float) width * (float) drawable.getIntrinsicHeight() / (float) drawable.getIntrinsicWidth());
            setMeasuredDimension(width,height);
        }else{
            super.onMeasure(widthMeasureSpec,heightMeasureSpec);
        }
    }
}