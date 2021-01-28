package com.llw.xfttsdemo;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * @author llw
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        SpeechUtility.createUtility(MyApplication.this, SpeechConstant.APPID +"=6010d1cf");
        super.onCreate();
    }
}
