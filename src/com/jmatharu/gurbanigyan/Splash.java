package com.jmatharu.gurbanigyan;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {
	MediaPlayer mp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Remove the Title Bar
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		// mp = MediaPlayer.create(Splash.this, R.raw.n);
        // mp.start();
        	

		Thread splash = new Thread() {
			public void run() {
				try {
					sleep(1);
					Intent landscape = new Intent(Splash.this, IndexPage.class);
					startActivity(landscape);
			//		mp.stop();
					 finish();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		splash.start();

	}

}
