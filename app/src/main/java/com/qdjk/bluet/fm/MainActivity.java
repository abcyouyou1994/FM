package com.qdjk.bluet.fm;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.qdjk.bluet.fm.fragment.S2Fragment;
import com.qdjk.bluet.fm.fragment.ScFragment;

public class MainActivity extends AppCompatActivity {
private RadioGroup radioGroup;
private RadioButton sc_rb,s2_rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();

    }

    private void initview() {
        sc_rb=(RadioButton)findViewById(R.id.screen_car);
        s2_rb=(RadioButton)findViewById(R.id.screen2);
        radioGroup=(RadioGroup)findViewById(R.id.radio_group);
        s2_rb.setChecked(true);
        initFragment(1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.screen2:
                        initFragment(1);
                        break;
                    case R.id.screen_car:
                        initFragment(2);
                        break;
                }
            }
        });

    }

    private void initFragment(int i){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        switch (i) {
            case 1:
            transaction.replace(R.id.fragment_main, new S2Fragment());
            transaction.commit();
            break;
            case 2:
                transaction.replace(R.id.fragment_main, new ScFragment());
                transaction.commit();
                break;
        }
    }
}
