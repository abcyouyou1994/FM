package com.qdjk.bluet.fm.fragment;

import android.view.View;
import android.widget.Button;

import com.qdjk.bluet.fm.R;

public class ScFragment extends BaseFragment {
    Button scBtnp,scBtnr,scBtnroad;
    @Override
    public View initView() {

        View view=View.inflate(mActivity,R.layout.sc_fragment,null);
        scBtnp=(Button)view.findViewById(R.id.sc_btn_param);
        scBtnr=(Button)view.findViewById(R.id.sc_btn_report);
        scBtnroad=(Button)view.findViewById(R.id.sc_btn_road);
        return view;
    }

    @Override
    public View initData() {
        return null;
    }
}
