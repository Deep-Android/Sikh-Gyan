package com.jmatharu.gurbanigyan.readGurbani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.jmatharu.gurbanigyan.R;

public class AnandSahib extends Activity {
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_anand_sahib);

		final ImageView imgView = (ImageView) findViewById(R.id.imAnandSahib);
		imgView.setImageResource(R.drawable.anandsahib01);

		Button bLast = (Button) findViewById(R.id.buttonLast5);
		Button bNext = (Button) findViewById(R.id.buttonNext5);

		bLast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				switch (counter) {
				case 1:
					imgView.setImageResource(R.drawable.anandsahib02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.anandsahib03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.anandsahib04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.anandsahib05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.anandsahib06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.anandsahib07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.anandsahib08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.anandsahib09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.anandsahib10);
					break;
				case 10:
					imgView.setImageResource(R.drawable.anandsahib11);
					break;
				case 11:
					imgView.setImageResource(R.drawable.anandsahib12);
					break;
				case 12:
					imgView.setImageResource(R.drawable.anandsahib13);
					break;
				case 13:
					imgView.setImageResource(R.drawable.anandsahib14);
					break;
				case 14:
					imgView.setImageResource(R.drawable.anandsahib15);
					break;
				case 15:
					imgView.setImageResource(R.drawable.anandsahib16);
					break;
				case 16:
					imgView.setImageResource(R.drawable.anandsahib17);
					break;
				case 17:
					imgView.setImageResource(R.drawable.anandsahib18);
					break;
				case 18:
					imgView.setImageResource(R.drawable.anandsahib19);
					break;
				case 19:
					imgView.setImageResource(R.drawable.anandsahib20);
					break;
				case 20:
					imgView.setImageResource(R.drawable.anandsahib21);
					break;
				case 21:
					imgView.setImageResource(R.drawable.anandsahib22);
					break;
				case 22:
					imgView.setImageResource(R.drawable.anandsahib23);
					break;
				case 23:
					imgView.setImageResource(R.drawable.anandsahib24);
					break;
				case 24:
					imgView.setImageResource(R.drawable.anandsahib25);
					break;
				case 25:
					imgView.setImageResource(R.drawable.anandsahib26);
					break;
				case 26:
					imgView.setImageResource(R.drawable.anandsahib27);
					break;
				case 27:
					imgView.setImageResource(R.drawable.anandsahib28);
					break;
				case 28:
					imgView.setImageResource(R.drawable.anandsahib29);
					break;
				case 29:
					imgView.setImageResource(R.drawable.anandsahib30);
					break;
				case 30:
					imgView.setImageResource(R.drawable.anandsahib31);
					break;
				case 31:
					imgView.setImageResource(R.drawable.anandsahib32);
					break;
				case 32:
					imgView.setImageResource(R.drawable.anandsahib33);
					break;
				case 33:
					imgView.setImageResource(R.drawable.anandsahib34);
					break;
				case 34:
					imgView.setImageResource(R.drawable.anandsahib35);
					break;
				case 35:
					imgView.setImageResource(R.drawable.anandsahib36);
					break;
				case 36:
					imgView.setImageResource(R.drawable.anandsahib37);
					break;
				case 37:
					imgView.setImageResource(R.drawable.anandsahib38);
					break;
				case 38:
					imgView.setImageResource(R.drawable.anandsahib40);
					break;
				case 39:
					imgView.setImageResource(R.drawable.anandsahib41);
					break;
				default:
					imgView.setImageResource(R.drawable.anandsahib01);
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
					imgView.setImageResource(R.drawable.anandsahib02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.anandsahib03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.anandsahib04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.anandsahib05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.anandsahib06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.anandsahib07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.anandsahib08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.anandsahib09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.anandsahib10);
					break;
				case 10:
					imgView.setImageResource(R.drawable.anandsahib11);
					break;
				case 11:
					imgView.setImageResource(R.drawable.anandsahib12);
					break;
				case 12:
					imgView.setImageResource(R.drawable.anandsahib13);
					break;
				case 13:
					imgView.setImageResource(R.drawable.anandsahib14);
					break;
				case 14:
					imgView.setImageResource(R.drawable.anandsahib15);
					break;
				case 15:
					imgView.setImageResource(R.drawable.anandsahib16);
					break;
				case 16:
					imgView.setImageResource(R.drawable.anandsahib17);
					break;
				case 17:
					imgView.setImageResource(R.drawable.anandsahib18);
					break;
				case 18:
					imgView.setImageResource(R.drawable.anandsahib19);
					break;
				case 19:
					imgView.setImageResource(R.drawable.anandsahib20);
					break;
				case 20:
					imgView.setImageResource(R.drawable.anandsahib21);
					break;
				case 21:
					imgView.setImageResource(R.drawable.anandsahib22);
					break;
				case 22:
					imgView.setImageResource(R.drawable.anandsahib23);
					break;
				case 23:
					imgView.setImageResource(R.drawable.anandsahib24);
					break;
				case 24:
					imgView.setImageResource(R.drawable.anandsahib25);
					break;
				case 25:
					imgView.setImageResource(R.drawable.anandsahib26);
					break;
				case 26:
					imgView.setImageResource(R.drawable.anandsahib27);
					break;
				case 27:
					imgView.setImageResource(R.drawable.anandsahib28);
					break;
				case 28:
					imgView.setImageResource(R.drawable.anandsahib29);
					break;
				case 29:
					imgView.setImageResource(R.drawable.anandsahib30);
					break;
				case 30:
					imgView.setImageResource(R.drawable.anandsahib31);
					break;
				case 31:
					imgView.setImageResource(R.drawable.anandsahib32);
					break;
				case 32:
					imgView.setImageResource(R.drawable.anandsahib33);
					break;
				case 33:
					imgView.setImageResource(R.drawable.anandsahib34);
					break;
				case 34:
					imgView.setImageResource(R.drawable.anandsahib35);
					break;
				case 35:
					imgView.setImageResource(R.drawable.anandsahib36);
					break;
				case 36:
					imgView.setImageResource(R.drawable.anandsahib37);
					break;
				case 37:
					imgView.setImageResource(R.drawable.anandsahib38);
					break;
				case 38:
					imgView.setImageResource(R.drawable.anandsahib40);
					break;
				case 39:
					imgView.setImageResource(R.drawable.anandsahib41);
					break;
				default:
					imgView.setImageResource(R.drawable.anandsahib01);
					break;
				}
			}
		});
	}

	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(AnandSahib.this,
				ReadGurbaniList.class);
		AnandSahib.this.startActivity(activityIntent);
		finish();

	}
}
