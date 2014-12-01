package org.ideas4j.controller;

import org.ideas4j.DoSomething.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class DsHome extends Activity {
  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_dshome);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(org.ideas4j.DoSomething.R.menu.menubar, menu);
	return true;
    }
	
}
