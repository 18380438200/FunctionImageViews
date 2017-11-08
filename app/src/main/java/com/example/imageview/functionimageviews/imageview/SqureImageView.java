package com.example.imageview.functionimageviews.imageview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Created by libo on 2017/11/7.
 */

public class SqureImageView extends AppCompatImageView{

    public SqureImageView(Context context) {
        super(context);
    }

    public SqureImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //让宽度的测量尺寸代替高度尺寸
        super.onMeasure(widthMeasureSpec,widthMeasureSpec);
    }
}
