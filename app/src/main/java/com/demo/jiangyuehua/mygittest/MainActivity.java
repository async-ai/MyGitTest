package com.demo.jiangyuehua.mygittest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		requestWindowFeature(Window.FEATURE_NO_TITLE);

	}
}
