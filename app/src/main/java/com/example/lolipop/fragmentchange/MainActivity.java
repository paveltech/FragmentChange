package com.example.lolipop.fragmentchange;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Handler;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public static final String TAG_FRAGMENT_1 ="fragment_1";
    public static final String TAG_FRAGMENT_2 = "fragment_2";
    private static String CURRENT_TAG = "";
    public static int navItemIndex = 0;
    private Handler handler;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        handler = new Handler();
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button_2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(0);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(1);
            }
        });

    }


    public void setFragment(int fragmentNumber){
        switch (fragmentNumber){
            case 0:
                navItemIndex = 0;
                CURRENT_TAG = TAG_FRAGMENT_1;
                break;
            case 1:
                navItemIndex =1;
                CURRENT_TAG = TAG_FRAGMENT_2;
                break;
        }
        loadHomeFragment();
    }


    private void loadHomeFragment(){

        Runnable pendingRunnable = new Runnable() {
            @Override
            public void run() {
                Fragment fragment = getHOmeFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                        android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.fram , fragment , CURRENT_TAG);
                fragmentTransaction.commitAllowingStateLoss();
            }
        };

        if (pendingRunnable!=null){
            handler.post(pendingRunnable);
        }
    }

    private Fragment getHOmeFragment(){
        switch (navItemIndex){
            case 0:
                Fragment_1 fragment1 = new Fragment_1();
                return fragment1;

            case 1:
                Fragment_2 fragment2 = new Fragment_2();
                return fragment2;


            default:
                return new Fragment_1();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
