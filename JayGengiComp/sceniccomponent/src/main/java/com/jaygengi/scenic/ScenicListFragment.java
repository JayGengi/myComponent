package com.jaygengi.scenic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.jaygengi.componentservice.eventbus.HotelData;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 景区Fragment
 * create by gengy 60167
 * at  18-3-21 下午5:17
 */

public class ScenicListFragment extends Fragment {

    private View view;//当前界面布局
    @BindView(R2.id.edit)
    EditText edit;
    @BindView(R2.id.button)
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.scenic_fragment, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }
    /**
     * 初始化UI
     * create by gengy 60167
     * at  18-3-21 下午5:19
     */
    private void initView(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new HotelData(edit.getText().toString()));
            }
        });
    }
}
