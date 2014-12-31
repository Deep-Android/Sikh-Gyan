package com.jmatharu.gurbanigyan.readGurbani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.jmatharu.gurbanigyan.R;

public class JaapSahib extends Activity {
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jaap_sahib);

		final ImageView imgView = (ImageView) findViewById(R.id.imJaapSahib);
		imgView.setImageResource(R.drawable.jaapsahib01);

		Button bLast = (Button) findViewById(R.id.buttonLast);
		Button bNext = (Button) findViewById(R.id.buttonNext);

		bLast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		bNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(JaapSahib.this,
				ReadGurbaniList.class);
		JaapSahib.this.startActivity(activityIntent);
		finish();
	}
}
