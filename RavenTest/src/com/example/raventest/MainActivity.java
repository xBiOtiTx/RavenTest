package com.example.raventest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends Activity {

	String[] data = { "a", "b", "c", "d", "e", "f", "g", "h" };
	GridView gvMain;
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		setContentView(R.layout.activity_main_grid_horisontal);
		//setContentView(R.layout.activity_main_grid);

		adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
		gvMain = (GridView) findViewById(R.id.gvMain);
		gvMain.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
