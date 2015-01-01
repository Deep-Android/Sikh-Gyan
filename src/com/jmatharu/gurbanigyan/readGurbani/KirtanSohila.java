package com.jmatharu.gurbanigyan.readGurbani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.jmatharu.gurbanigyan.R;

public class KirtanSohila extends Activity {
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kirtan_sohila);

		final ImageView imgView = (ImageView) findViewById(R.id.imkirtan_sohila);
		imgView.setImageResource(R.drawable.kirtansohila01);
		

		Button bLast = (Button) findViewById(R.id.buttonLast8);
		Button bNext = (Button) findViewById(R.id.buttonNext8);

		bLast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				switch (counter) {
				case 1:
					imgView.setImageResource(R.drawable.kirtansohila02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.kirtansohila03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.kirtansohila04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.kirtansohila05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.kirtansohila06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.kirtansohila07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.kirtansohila08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.kirtansohila09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.kirtansohila10);
					break;
				default:
					imgView.setImageResource(R.drawable.kirtansohila01);
					break;
				}
			}
		});

		bNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				switch (counter) {
				case 1:
					imgView.setImageResource(R.drawable.kirtansohila02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.kirtansohila03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.kirtansohila04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.kirtansohila05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.kirtansohila06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.kirtansohila07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.kirtansohila08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.kirtansohila09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.kirtansohila10);
					break;
				default:
					imgView.setImageResource(R.drawable.kirtansohila01);
					break;
				}
			}
		});
	}

	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(KirtanSohila.this,
				ReadGurbaniList.class);
		KirtanSohila.this.startActivity(activityIntent);
		finish();

	}

}
