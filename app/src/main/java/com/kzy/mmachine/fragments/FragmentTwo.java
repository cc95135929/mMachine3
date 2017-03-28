package com.kzy.mmachine.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kzy.mmachine.R;

/**
 * 项目名称：
 * 类描述：
 * 作者：王文超  2017/3/28 0028 10:00
 * 邮箱：wc95135929@163.com
 */

public class FragmentTwo extends BaseFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_menu_fragent,null);
    }
}
