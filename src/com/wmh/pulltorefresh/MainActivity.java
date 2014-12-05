package com.wmh.pulltorefresh;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

	private MyRefreshView mMyRefreshView;
	private ProgressBar moreProgressBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mMyRefreshView = (MyRefreshView)findViewById(R.id.infomation_tab_list);
		mMyRefreshView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
     }
      
     private List<String> getData(){
         List<String> data = new ArrayList<String>();
         for(int i = 0; i< 15; i++) {
        	 data.add("Test data " + i);
         }
          
         return data;
     }

}