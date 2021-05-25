package com.clarkwu.diskfragmenter.base;

import android.graphics.PixelFormat;
import android.os.Bundle;
import android.app.Activity;
import android.view.WindowManager;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去掉横竖屏切换动画
        getWindow().setSoftInputMode(WindowManager.LayoutParams.ROTATION_ANIMATION_SEAMLESS);
        //设置需要显示Activity的PixelFormat
        getWindow().setFormat(PixelFormat.RGBA_8888);
        //它指定此窗口在旋转后将淡入或淡出
        getWindow().addFlags(WindowManager.LayoutParams.ROTATION_ANIMATION_CHANGED);
    }
}