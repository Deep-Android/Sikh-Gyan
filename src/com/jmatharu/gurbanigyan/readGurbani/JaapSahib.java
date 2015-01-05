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
				counter--;
				switch (counter) {
				case 1:
					imgView.setImageResource(R.drawable.jaapsahib02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.jaapsahib03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.jaapsahib04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.jaapsahib05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.jaapsahib06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.jaapsahib07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.jaapsahib08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.jaapsahib09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.jaapsahib10);
					break;
				case 10:
					imgView.setImageResource(R.drawable.jaapsahib11);
					break;
				case 11:
					imgView.setImageResource(R.drawable.jaapsahib12);
					break;
				case 12:
					imgView.setImageResource(R.drawable.jaapsahib13);
					break;
				case 13:
					imgView.setImageResource(R.drawable.jaapsahib14);
					break;
				case 14:
					imgView.setImageResource(R.drawable.jaapsahib15);
					break;
				case 15:
					imgView.setImageResource(R.drawable.jaapsahib16);
					break;
				case 16:
					imgView.setImageResource(R.drawable.jaapsahib17);
					break;
				case 17:
					imgView.setImageResource(R.drawable.jaapsahib18);
					break;
				case 18:
					imgView.setImageResource(R.drawable.jaapsahib19);
					break;
				case 19:
					imgView.setImageResource(R.drawable.jaapsahib20);
					break;
				case 20:
					imgView.setImageResource(R.drawable.jaapsahib21);
					break;
				case 21:
					imgView.setImageResource(R.drawable.jaapsahib22);
					break;
				case 22:
					imgView.setImageResource(R.drawable.jaapsahib23);
					break;
				case 23:
					imgView.setImageResource(R.drawable.jaapsahib24);
					break;
				case 24:
					imgView.setImageResource(R.drawable.jaapsahib25);
					break;
				case 25:
					imgView.setImageResource(R.drawable.jaapsahib26);
					break;
				case 26:
					imgView.setImageResource(R.drawable.jaapsahib27);
					break;
				case 27:
					imgView.setImageResource(R.drawable.jaapsahib28);
					break;
				case 28:
					imgView.setImageResource(R.drawable.jaapsahib29);
					break;
				case 29:
					imgView.setImageResource(R.drawable.jaapsahib30);
					break;
				case 30:
					imgView.setImageResource(R.drawable.jaapsahib31);
					break;
				case 31:
					imgView.setImageResource(R.drawable.jaapsahib32);
					break;
				case 32:
					imgView.setImageResource(R.drawable.jaapsahib33);
					break;
				case 33:
					imgView.setImageResource(R.drawable.jaapsahib34);
					break;
				case 34:
					imgView.setImageResource(R.drawable.jaapsahib35);
					break;
				case 35:
					imgView.setImageResource(R.drawable.jaapsahib36);
					break;
				case 36:
					imgView.setImageResource(R.drawable.jaapsahib37);
					break;
				case 37:
					imgView.setImageResource(R.drawable.jaapsahib38);
					break;
				case 38:
					imgView.setImageResource(R.drawable.jaapsahib39);
					break;
				case 39:
					imgView.setImageResource(R.drawable.jaapsahib40);
					break;
				case 40:
					imgView.setImageResource(R.drawable.jaapsahib41);
					break;
				case 41:
					imgView.setImageResource(R.drawable.jaapsahib42);
					break;
				case 42:
					imgView.setImageResource(R.drawable.jaapsahib43);
					break;
				case 43:
					imgView.setImageResource(R.drawable.jaapsahib44);
					break;
				case 44:
					imgView.setImageResource(R.drawable.jaapsahib45);
					break;
				case 45:
					imgView.setImageResource(R.drawable.jaapsahib46);
					break;
				case 46:
					imgView.setImageResource(R.drawable.jaapsahib47);
					break;
				case 47:
					imgView.setImageResource(R.drawable.jaapsahib48);
					break;
				case 48:
					imgView.setImageResource(R.drawable.jaapsahib49);
					break;
				case 49:
					imgView.setImageResource(R.drawable.jaapsahib50);
					break;
				case 50:
					imgView.setImageResource(R.drawable.jaapsahib51);
					break;
				case 51:
					imgView.setImageResource(R.drawable.jaapsahib52);
					break;
				default:
					imgView.setImageResource(R.drawable.jaapsahib01);
					break;
				}
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
