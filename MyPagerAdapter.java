package com.example.nikhilkaushik.aryahitlist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Nikhil Kaushik on 1/8/2017.
 */


    public class MyPagerAdapter extends FragmentPagerAdapter  {


        public static int x=0;

        public static int NUM_ITEMS = 7;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }


        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(final int position) {
            x=position;
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment

                    return FirstFragment.newInstance("Reason: Donald Trump is a racist liar. Plus, Arya wants his property.", "Donald Trump");
                case 1:

                    return FirstFragment.newInstance("Reason: Kim Jong-un is an unstable, war-mongering monarch. Arya wants his power.", "Kim Jong-un");
                case 2:

                    return FirstFragment.newInstance("Reason: Rahul Gandhi is the 'pappu of India'. Arya despises him.", "Rahul Gandhi");
                case 3:
                    return FirstFragment.newInstance("Reason: Katrina Kaif's poor acting skills make her a suitable candidate for this list.", "Katrina Kaif");
                case 4:
                    return FirstFragment.newInstance("Reason: 2010 was hard on him. Now, he's screwed.","Suresh Kalmadi");
                case 5:
                    return FirstFragment.newInstance("Reason: She lost to Donald Trump. Period.","Hillary Clinton");
                case 6:
                    return FirstFragment.newInstance("Reason: Because it is Modi's fault.","Arvind Kejriwal");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Target " + (position+1);
        }

    }

