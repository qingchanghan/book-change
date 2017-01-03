package com.example.qingchanghan.tab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Qingchang Han on 2017/1/3.
 */

@SuppressLint("ValidFragment")
public class Fragment3 extends Fragment{
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;
    private FragmentManager fragmentManager;

    private TabLayout.Tab one;
    private TabLayout.Tab two;

    public Fragment3(FragmentManager fragmentManager) {
        super();
        this.fragmentManager = fragmentManager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_mine,container,false);//这里改成自己的layout

        //初始化视图
        initViews(view);
        return view;
    }

    private void initViews(View view) {

        //使用适配器将ViewPager与Fragment绑定在一起
        mViewPager= (ViewPager) view.findViewById(R.id.viewPager);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(this.fragmentManager);
        mViewPager.setAdapter(myFragmentPagerAdapter);

        //将TabLayout与ViewPager绑定在一起
        mTabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        //指定Tab的位置
        one = mTabLayout.getTabAt(0);
        two = mTabLayout.getTabAt(1);
    }
}
