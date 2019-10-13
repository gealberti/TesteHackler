
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		splash
	 *	@date 		0
	 *	@title 		Splash
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.2.9.xd
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class splash_activity extends Activity {

	
	private View _bg__splash_ek2;
	private TextView hackler;
	private ImageView hacker_logo;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		
		_bg__splash_ek2 = (View) findViewById(R.id._bg__splash_ek2);
		hackler = (TextView) findViewById(R.id.hackler);
		hacker_logo = (ImageView) findViewById(R.id.hacker_logo);
	
		
		//custom code goes here
	
	}
}
	
	