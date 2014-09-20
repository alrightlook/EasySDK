package com.game.loginsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.easysdk.loginframework.LoginFramework;
import com.example.loginlib.LoginLib;

public class LoginSample extends Activity {

	private Button mDoLoginBtn;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.mainlayout);
	    
	    LoginLib.newInstance(this);
	    LoginLib.Instance().Init(this);
	    
	    mDoLoginBtn = (Button)findViewById(R.id.button1);
	    mDoLoginBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				((LoginFramework)LoginLib.Instance()).doLogin();
				
			}
	    	
	    });
	    // TODO Auto-generated method stub
	}

}
