package com.example.loginlib;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import android.app.Activity;
import android.content.Context;

public abstract class LoginLib {
	protected LoginLib() {}
	private static LoginLib m_Instance;
	protected Activity m_Activity;
	
	public static LoginLib Instance() 
	{
		return m_Instance;
	}
	
	protected Context getActivity()
	{
		return m_Activity;
	}
	
	public static void newInstance(String libName)
	{
		try {
			Constructor<?> c = Class.forName(libName).getDeclaredConstructor();
			c.setAccessible(true);
			Object obj = c.newInstance();
			if (obj instanceof LoginLib) {
				m_Instance = (LoginLib)obj;
			}

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Init(Activity ctx)
	{
		m_Activity = ctx;
		m_Instance = this;
	}
	
	abstract public void doLogin();
}
