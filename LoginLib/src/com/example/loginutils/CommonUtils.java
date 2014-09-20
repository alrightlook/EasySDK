package com.example.loginutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import android.content.Context;

public class CommonUtils {
	public static String getLibClassName(Context ctx)
	{
		String res = null;
		try {
			InputStream is = ctx.getAssets().open("config.properties");
			Properties prop = new Properties();
			prop.load(is);
			res = (String) prop.get("libsdkname");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return res;
	}

}
