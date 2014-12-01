package org.ideas4j.controller.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DsMenuBar extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View vista = inflater.inflate(org.ideas4j.DoSomething.R.layout.fragment_menubar, container,false);
		return vista;
	}
}
