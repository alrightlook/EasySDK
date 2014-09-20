package com.easysdk.loginofficial;

import android.content.Intent;

import com.example.loginlib.LoginLib;

public class LoginOfficial extends LoginLib {

	@Override
	public void doLogin() {
		// TODO Auto-generated method stub
		m_Activity.startActivity(new Intent(m_Activity, LoginActivity.class));
	}
	

}
