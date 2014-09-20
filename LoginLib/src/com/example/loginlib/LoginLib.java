package com.example.loginlib;

import android.app.Activity;
import android.content.Intent;

public class LoginLib {
	protected LoginLib() {}
	private static LoginLib m_Instance;
	private Activity m_Activity;
	
	public static LoginLib Instance() 
	{
		if(m_Instance == null) {
			m_Instance = new LoginLib();
		}
		return m_Instance;
	}
	
	public void Init(Activity ctx)
	{
		m_Activity = ctx;
	}
	
	public void doLogin() 
	{
		m_Activity.startActivity(new Intent(m_Activity, LoginActivity.class));
	}
}
