package com.kzy.mmachine.activitys;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.kzy.mmachine.R;
import com.kzy.mmachine.fragments.FragmentOne;
import com.kzy.mmachine.fragments.FragmentThree;
import com.kzy.mmachine.fragments.FragmentTwo;

public class MainActivity extends FragmentActivity {

    private FragmentTabHost fragmentTabHost;
    private String texts[] = {"首页", "个人", "咨询"};
    private int imageButton[] = {R.drawable.bt_home_selector, R.drawable.bt_message_selector, R.drawable.bt_home_selector, R.drawable.bt_home_selector, R.drawable.bt_home_selector};
    private Class fragmentArray[] = {FragmentOne.class, FragmentTwo.class, FragmentThree.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 实例化tabhost
        fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this, getSupportFragmentManager(),
                R.id.maincontent);

        for (int i = 0; i < texts.length; i++) {
            TabHost.TabSpec spec = fragmentTabHost.newTabSpec(texts[i]).setIndicator(getView(i));

            fragmentTabHost.addTab(spec, fragmentArray[i], null);

            //设置背景(必须在addTab之后，由于需要子节点（底部菜单按钮）否则会出现空指针异常)
            fragmentTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.bt_selector);
        }
    }

    private View getView(int i) {
        //取得布局实例
        View view = View.inflate(MainActivity.this, R.layout.menu_deep_fragment, null);

        //取得布局对象
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.text);

        //设置图标
        imageView.setImageResource(imageButton[i]);
        //设置标题
        textView.setText(texts[i]);
        return view;
    }
}


