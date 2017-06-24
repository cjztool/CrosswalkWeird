package com.cjz.crosswalkdemo;

import android.app.Activity;
import android.os.Bundle;

import org.xwalk.core.XWalkResourceClient;
import org.xwalk.core.XWalkView;

public class MainActivity extends Activity {


    private XWalkView xDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        xDemo = (XWalkView) findViewById(R.id.xDemo);

        xDemo.setResourceClient(new XWalkResourceClient(xDemo) {

            @Override
            public boolean shouldOverrideUrlLoading(XWalkView view, String url) {
                super.shouldOverrideUrlLoading(view, url);
                view.loadUrl(url);
                return true;
            }

        });

        xDemo.loadUrl("http://api.49you.com/Api/Channelhf/Login/platformid/9/ptgid/170/pf/gzyx?gouzaiId=G-1c33ef0bd3842141c990c15222f9a541&token=60371d78f770f580&versionNum=111");
    }
}
