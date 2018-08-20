package com.example.ling.beijingnews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rl_splahs_root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl_splahs_root = (RelativeLayout)findViewById(R.id.rl_splahs_root);

        //渐变动画，缩放动画，旋转动画
        AlphaAnimation aa = new AlphaAnimation(0,1);
        aa.setDuration(500);//持续时间
        aa.setFillAfter(true);

        ScaleAnimation sa = new ScaleAnimation(0,1,0,1, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        sa.setDuration(500);
        sa.setFillAfter(true);

        RotateAnimation ra = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        ra.setDuration(500);
        ra.setFillAfter(true);

        AnimationSet set = new AnimationSet(false);
        //添加三个动画没有先后顺序
        set.addAnimation(aa);
        set.addAnimation(sa);
        set.addAnimation(ra);

        rl_splahs_root.startAnimation(set);



    }
}
