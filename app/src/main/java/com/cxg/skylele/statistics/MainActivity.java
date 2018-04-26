package com.cxg.skylele.statistics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.umeng.analytics.MobclickAgent;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MobclickAgent.onEvent(MainActivity.this, Constant.EVENT_MAIN_NEXT);
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}
