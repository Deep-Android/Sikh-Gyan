package com.jmatharu.gurbanigyan;

import com.jmatharu.gurbanigyan.readGurbani.ReadGurbaniList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
						FragmentList.class);
				IndexPage.this.startActivity(activityIntent);
				// finish();
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
				finish();
			}
		});

		Button bQuiz = (Button) findViewById(R.id.button3);
		bQuiz.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(IndexPage.this, Quiz.class);
				IndexPage.this.startActivity(activityIntent);
				finish();
			}
		});
		Button bRead = (Button) findViewById(R.id.button4);
		bRead.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(IndexPage.this,
						ReadGurbaniList.class);
				IndexPage.this.startActivity(activityIntent);
				finish();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.contact_me) {
			Intent activityIntent = new Intent(IndexPage.this, ContactMe.class);
			IndexPage.this.startActivity(activityIntent);
			finish();
		}
		return super.onOptionsItemSelected(item);
	}

}