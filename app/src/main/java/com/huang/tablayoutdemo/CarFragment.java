package com.huang.tablayoutdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by huang on 2018/5/28.
 */

public class CarFragment extends BaseFragment {

    @Override
    protected View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView view = new TextView(mContext);
        view.setText("Car Fragment");
        view.setGravity(Gravity.CENTER);
        view.setTextSize(18);
        view.setTextColor(Color.BLACK);
        return view;
    }
}
