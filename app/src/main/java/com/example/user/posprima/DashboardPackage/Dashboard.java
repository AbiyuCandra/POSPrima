package com.example.user.posprima.DashboardPackage;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.user.posprima.DashboardPackage.ViewPageAdapter;
import com.example.user.posprima.R;

public class Dashboard extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragment(new Dashboard_Library(), "Libary");
        adapter.AddFragment(new Dashboard_Barcode(), "Barcode");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
