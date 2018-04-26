package com.cxg.skylele.statistics;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by cxg on 2018/4/26.
 *
 * @version 1.0.0
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initUment();
    }

    private void initUment() {

        //如果项目的Manifest文件中已经配置【友盟+】的AppKey和Channel，则使用该方法初始化，同时不必再次传入AppKey和Channel两个参数。
        /**
         * 初始化common库
         * 参数1:上下文，不能为空
         * 参数2:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
         * 参数3:Push推送业务的secret 需要集成Push功能时必须传入Push的secret，否则传空。
         */
//        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, "1fe6a20054bcef865eeb0991ee84525b");

        /**
         * 初始化common库
         * 参数1:上下文，不能为空
         * 参数2:【友盟+】 AppKey
         * 参数3:【友盟+】 Channel
         * 参数4:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
         * 参数5:Push推送业务的secret
         */
        UMConfigure.init(this, "5ae16bfcb27b0a70840000b3", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, null);
    }
}
