package com.jmatharu.gurbanigyan.readGurbani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.jmatharu.gurbanigyan.ContactMe;
import com.jmatharu.gurbanigyan.IndexPage;
import com.jmatharu.gurbanigyan.R;

public class ReadGurbaniList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_read_gurbani_list);
		
		Button bRead1 = (Button) findViewById(R.id.bReadJapjiSahib);
		bRead1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(ReadGurbaniList.this,
						JapjiSahib1.class);
				ReadGurbaniList.this.startActivity(activityIntent);
				finish();
			}
		});
		
		Button bRead3 = (Button) findViewById(R.id.bReadTavPrasadSavaiye);
		bRead3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(ReadGurbaniList.this,
						TavPrasadSavaiye.class);
				ReadGurbaniList.this.startActivity(activityIntent);
				finish();
			}
		});
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(ReadGurbaniList.this,
				IndexPage.class);
		ReadGurbaniList.this.startActivity(activityIntent);
		finish();
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
			Intent activityIntent = new Intent(ReadGurbaniList.this,
					ContactMe.class);
			ReadGurbaniList.this.startActivity(activityIntent);
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
}
