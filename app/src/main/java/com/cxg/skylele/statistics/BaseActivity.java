package com.cxg.skylele.statistics;

import android.app.Activity;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by cxg on 2018/4/26.
 *
 * @version 1.0.0
 */

public class BaseActivity extends Activity {
    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
}
