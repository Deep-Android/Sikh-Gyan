package com.jmatharu.gurbanigyan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index_page);

		Button b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(IndexPage.this,
						MainActivity.class);
				IndexPage.this.startActivity(activityIntent);
			}
		});

		Button bYoutube = (Button) findViewById(R.id.button2);
		bYoutube.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(IndexPage.this,
						YoutubeList.class);
				IndexPage.this.startActivity(activityIntent);
			}
		});

	}
}