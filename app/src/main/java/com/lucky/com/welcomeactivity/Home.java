package com.lucky.com.welcomeactivity;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Home extends AppCompatActivity {

    private FrameLayout mainframe;
    private BottomNavigationView mainnav;
    private listfragment listfrag;
    private addfragment addfrag;
    private settingsfragment settingsfrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mainframe=findViewById(R.id.main_frame);
        mainnav=findViewById(R.id.main_nav);


        listfrag=new listfragment();
        addfrag=new addfragment();
        settingsfrag=new settingsfragment();


        mainnav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.home:

                        setfragment(listfrag);
                        return true;

                    case R.id.Add:
                        setfragment(addfrag);

                        return true;

                    case R.id.settings:
                        setfragment(settingsfrag);

                        return true;

                    default:
                        return false;


                }
            }
        });


    }


    private void setfragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment);
        fragmentTransaction.commit();


    }
}
