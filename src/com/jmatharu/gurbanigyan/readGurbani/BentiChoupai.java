package com.jmatharu.gurbanigyan.readGurbani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.jmatharu.gurbanigyan.R;

public class BentiChoupai extends Activity {
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_benti_choupai);

		final ImageView imgView = (ImageView) findViewById(R.id.imBenti_choupai);
		imgView.setImageResource(R.drawable.bentichoupai01);

		Button bLast = (Button) findViewById(R.id.buttonLast4);
		Button bNext = (Button) findViewById(R.id.buttonNext4);

		bLast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				switch (counter) {
				case 1:
					imgView.setImageResource(R.drawable.bentichoupai02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.bentichoupai03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.bentichoupai04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.bentichoupai05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.bentichoupai06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.bentichoupai07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.bentichoupai08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.bentichoupai09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.bentichoupai10);
					break;
				default:
					imgView.setImageResource(R.drawable.bentichoupai01);
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
					imgView.setImageResource(R.drawable.bentichoupai02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.bentichoupai03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.bentichoupai04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.bentichoupai05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.bentichoupai06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.bentichoupai07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.bentichoupai08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.bentichoupai09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.bentichoupai10);
					break;
				default:
					imgView.setImageResource(R.drawable.bentichoupai01);
					break;
				}
			}
		});

	}

	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(BentiChoupai.this,
				ReadGurbaniList.class);
		BentiChoupai.this.startActivity(activityIntent);
		finish();

	}
}
