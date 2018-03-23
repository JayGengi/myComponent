package com.jaygengi.jaygengicomp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.jaygengi.componentlib.router.Router;
import com.jaygengi.componentservice.hotel.GetHotelListService;
import com.jaygengi.componentservice.scenic.GetScenicListService;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页
 * create by gengy 60167
 * at  18-3-21 下午3:52
 */
public class MainActivity extends AppCompatActivity {

    private FrameLayout fragmentLayout;
    private Fragment homeFragment;
    private List<android.support.v4.app.Fragment> fragmentList;
    FragmentTransaction transaction;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        fragmentLayout = findViewById(R.id.fragment_layout);
        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setFragment();
        showFrag(0);
    }
    /**
     * 初始化Fragment
     * create by gengy 60167
     * at  18-3-21 下午5:05
     */
    private void setFragment() {
        fragmentManager = getSupportFragmentManager();

        homeFragment = new MainFragment();
        Router router = Router.getInstance();

        Router.registerComponent("com.jaygengi.hotel.applike.HotelAppLike");
        Router.registerComponent("com.jaygengi.scenic.applike.ScenicAppLike");

        GetHotelListService hotelListService = (GetHotelListService)router.getService(GetHotelListService.class.getSimpleName());
        GetScenicListService ScenicListService = (GetScenicListService)router.getService(GetScenicListService.class.getSimpleName());

        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(homeFragment);
        fragmentList.add(hotelListService.GetHotelListFragment());//酒店列表
        fragmentList.add(ScenicListService.GetScenicListFragment());//景区列表
        setFrag();
    }

    private void setFrag() {
        for (Fragment fragment : fragmentList) {
            transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.fragment_layout, fragment).commitAllowingStateLoss();
        }
    }
    private void showFrag(int index) {
        for (int i = 0; i < fragmentList.size(); i++) {
            transaction = fragmentManager.beginTransaction();
            if (i == index) {
                transaction.show(fragmentList.get(i)).commitAllowingStateLoss();
            } else {
                transaction.hide(fragmentList.get(i)).commitAllowingStateLoss();
            }
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    showFrag(0);
                    return true;
                case R.id.navigation_dashboard:
                    showFrag(1);
                    return true;
                case R.id.navigation_notifications:
                    showFrag(2);
                    return true;
            }
            return false;
        }
    };
}
