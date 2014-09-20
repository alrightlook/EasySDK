package com.easysdk.loginframework;

import android.app.Activity;
import android.widget.Toast;

import com.example.loginlib.LoginLib;

public class LoginFramework extends LoginLib{
	
	@Override
	public void doLogin()
	{
		Toast.makeText(getActivity(), 
				"This is Framework please use EasySDK or do some test here", Toast.LENGTH_LONG).show();
	}
}
