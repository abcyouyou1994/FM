package com.qdjk.bluet.fm.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.qdjk.bluet.fm.R;

public class S2Fragment extends BaseFragment {
    private Button s2_param,s2_report;
    @Override
    public View initView() {
      View view=View.inflate(mActivity,R.layout.s2_fragment,null);
      s2_param=(Button)view.findViewById(R.id.s2_btn_params);
      s2_report=(Button)view.findViewById(R.id.s2_btn_report);
      s2_param.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
                changeFragment();
          }
      });
        return view;
    }

    @Override
    public View initData() {

        return null;
    }
    public void changeFragment(){

    }
}
