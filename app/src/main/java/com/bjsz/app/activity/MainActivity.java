package com.bjsz.app.activity;

import com.bjsz.app.R;
import com.bjsz.app.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by John on 2016/12/23.
 */

public class MainActivity extends BaseActivity{

    //记录是否有首次按键
    private boolean mBackKeyPressed = false;

    @Override
    protected void bindViews() {
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initActionBar() {

    }

    /**
     * 监听后退键，点击两次退出APP
     */
    @Override
    public void onBackPressed() {
        if(!mBackKeyPressed){
            showToast("再按一次退出应用");
            mBackKeyPressed = true;
            //延时两秒，如果超出则擦除第一次按键记录
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    mBackKeyPressed = false;
                }
            }, 2000);
        }else{
            //退出程序
            this.finish();
            System.exit(0);
        }
    }

}
