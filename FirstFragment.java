package com.example.nikhilkaushik.aryahitlist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.nikhilkaushik.aryahitlist.MyPagerAdapter.NUM_ITEMS;
import static com.example.nikhilkaushik.aryahitlist.MyPagerAdapter.x;


public class FirstFragment extends Fragment {
    // Store instance variables
    private String title;
    private String reason;
    private Button kill;
    private RelativeLayout relativeLayout;
    int toggle[]=new int[NUM_ITEMS];


    // newInstance constructor for creating fragment with arguments
    public static FirstFragment newInstance(String reason, String title) {
        FirstFragment fragmentFirst = new FirstFragment();
        Bundle args = new Bundle();
        args.putString("someReason", reason);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        reason = getArguments().getString("someReason");
        title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        tvLabel.setText(title);
        TextView tvReason = (TextView) view.findViewById(R.id.tvReason);
        tvReason.setText(reason);

        kill = (Button) view.findViewById(R.id.button);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.relativeLayout);


        if (toggle[x]%2!=0){
            relativeLayout.setBackgroundResource(R.drawable.danger);
        }

        kill.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                toggle[x]++;
                if (toggle[x]%2==0) relativeLayout.setBackgroundColor(0);
                else relativeLayout.setBackgroundResource(R.drawable.danger);
            }
            });


        return view;
    }
}
