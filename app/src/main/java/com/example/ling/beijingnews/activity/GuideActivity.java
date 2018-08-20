package com.example.ling.beijingnews.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ling.beijingnews.R;

import java.util.ArrayList;

public class GuideActivity extends Activity {

    private ViewPager viewpager;
    private Button btn_start_main;
    private LinearLayout ll_point_group;
    private ArrayList<ImageView> imageviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        viewpager = (ViewPager)findViewById(R.id.viewpager);
        btn_start_main = (Button)findViewById(R.id.btn_start_main);
        ll_point_group = (LinearLayout)findViewById(R.id.ll_point_group);

        //准备数据
        int [] ids = new int[]{
                R.drawable.guide_1,
                R.drawable.guide_2,
                R.drawable.guide_3
        };

        imageviews = new ArrayList<>();
        for (int i = 0 ;i<ids.length;i++){
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(ids[i]);
            //添加到集合中
            imageviews.add(imageView);
        }
        //设置viewPager
        viewpager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return imageviews.size();
            }

            @Override
            public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
                return object==view;
            }

            /**
             *
             * @param container viewpager
             * @param position  要创建页面的位置
             * @return  返回和创建当前页面的值
             */
            @NonNull
            @Override
            public Object instantiateItem(@NonNull ViewGroup container, int position) {

                //添加到容器中
                ImageView imageView = imageviews.get(position);
                //return super.instantiateItem(container, position);
                container.addView(imageView);
                return imageView;
            }

            /**
             *
             * @param container  viewpager
             * @param position  要销毁的页面的位置
             * @param object    要销毁的页面
             */

            @Override
            public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
                //super.destroyItem(container, position, object);
                container.removeView((View) object);
            }
        });
    }
}
