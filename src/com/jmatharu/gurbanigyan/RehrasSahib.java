package com.jmatharu.gurbanigyan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.jmatharu.gurbanigyan.readGurbani.ReadGurbaniList;

public class RehrasSahib extends Activity {
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rehras_sahib);

		final ImageView imgView = (ImageView) findViewById(R.id.imRehraasSahib);
		imgView.setImageResource(R.drawable.rehrassahib01);

		Button bLast = (Button) findViewById(R.id.buttonLast6);
		Button bNext = (Button) findViewById(R.id.buttonNext6);

		bLast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				switch (counter) {
				case 1:
					imgView.setImageResource(R.drawable.rehrassahib02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.rehrassahib03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.rehrassahib04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.rehrassahib05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.rehrassahib06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.rehrassahib07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.rehrassahib08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.rehrassahib09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.rehrassahib10);
					break;
				case 10:
					imgView.setImageResource(R.drawable.rehrassahib11);
					break;
				case 11:
					imgView.setImageResource(R.drawable.rehrassahib12);
					break;
				case 12:
					imgView.setImageResource(R.drawable.rehrassahib13);
					break;
				case 13:
					imgView.setImageResource(R.drawable.rehrassahib14);
					break;
				case 14:
					imgView.setImageResource(R.drawable.rehrassahib15);
					break;
				case 15:
					imgView.setImageResource(R.drawable.rehrassahib16);
					break;
				case 16:
					imgView.setImageResource(R.drawable.rehrassahib17);
					break;
				case 17:
					imgView.setImageResource(R.drawable.rehrassahib18);
					break;
				case 18:
					imgView.setImageResource(R.drawable.rehrassahib19);
					break;
				case 19:
					imgView.setImageResource(R.drawable.rehrassahib20);
					break;
				case 20:
					imgView.setImageResource(R.drawable.rehrassahib21);
					break;
				case 21:
					imgView.setImageResource(R.drawable.rehrassahib22);
					break;
				case 22:
					imgView.setImageResource(R.drawable.rehrassahib23);
					break;
				case 23:
					imgView.setImageResource(R.drawable.rehrassahib24);
					break;
				case 24:
					imgView.setImageResource(R.drawable.rehrassahib25);
					break;
				case 25:
					imgView.setImageResource(R.drawable.rehrassahib26);
					break;
				case 26:
					imgView.setImageResource(R.drawable.rehrassahib27);
					break;
				case 27:
					imgView.setImageResource(R.drawable.rehrassahib28);
					break;
				case 28:
					imgView.setImageResource(R.drawable.rehrassahib29);
					break;
				case 29:
					imgView.setImageResource(R.drawable.rehrassahib30);
					break;
				case 30:
					imgView.setImageResource(R.drawable.rehrassahib31);
					break;
				case 31:
					imgView.setImageResource(R.drawable.rehrassahib32);
					break;
				case 32:
					imgView.setImageResource(R.drawable.rehrassahib33);
					break;
				case 33:
					imgView.setImageResource(R.drawable.rehrassahib34);
					break;
				case 34:
					imgView.setImageResource(R.drawable.rehrassahib35);
					break;
				case 35:
					imgView.setImageResource(R.drawable.rehrassahib36);
					break;
				case 36:
					imgView.setImageResource(R.drawable.rehrassahib37);
					break;
				case 37:
					imgView.setImageResource(R.drawable.rehrassahib38);
					break;
				case 38:
					imgView.setImageResource(R.drawable.rehrassahib39);
					break;
				case 39:
					imgView.setImageResource(R.drawable.rehrassahib40);
					break;
				case 40:
					imgView.setImageResource(R.drawable.rehrassahib41);
					break;
				case 41:
					imgView.setImageResource(R.drawable.rehrassahib42);
					break;
				case 42:
					imgView.setImageResource(R.drawable.rehrassahib43);
					break;
				case 43:
					imgView.setImageResource(R.drawable.rehrassahib44);
					break;
				case 44:
					imgView.setImageResource(R.drawable.rehrassahib45);
					break;
				case 45:
					imgView.setImageResource(R.drawable.rehrassahib46);
					break;
				case 46:
					imgView.setImageResource(R.drawable.rehrassahib47);
					break;
				case 47:
					imgView.setImageResource(R.drawable.rehrassahib48);
					break;
				case 48:
					imgView.setImageResource(R.drawable.rehrassahib49);
					break;
				case 49:
					imgView.setImageResource(R.drawable.rehrassahib50);
					break;
				case 50:
					imgView.setImageResource(R.drawable.rehrassahib51);
					break;
				default:
					imgView.setImageResource(R.drawable.rehrassahib01);
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
					imgView.setImageResource(R.drawable.rehrassahib02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.rehrassahib03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.rehrassahib04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.rehrassahib05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.rehrassahib06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.rehrassahib07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.rehrassahib08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.rehrassahib09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.rehrassahib10);
					break;
				case 10:
					imgView.setImageResource(R.drawable.rehrassahib11);
					break;
				case 11:
					imgView.setImageResource(R.drawable.rehrassahib12);
					break;
				case 12:
					imgView.setImageResource(R.drawable.rehrassahib13);
					break;
				case 13:
					imgView.setImageResource(R.drawable.rehrassahib14);
					break;
				case 14:
					imgView.setImageResource(R.drawable.rehrassahib15);
					break;
				case 15:
					imgView.setImageResource(R.drawable.rehrassahib16);
					break;
				case 16:
					imgView.setImageResource(R.drawable.rehrassahib17);
					break;
				case 17:
					imgView.setImageResource(R.drawable.rehrassahib18);
					break;
				case 18:
					imgView.setImageResource(R.drawable.rehrassahib19);
					break;
				case 19:
					imgView.setImageResource(R.drawable.rehrassahib20);
					break;
				case 20:
					imgView.setImageResource(R.drawable.rehrassahib21);
					break;
				case 21:
					imgView.setImageResource(R.drawable.rehrassahib22);
					break;
				case 22:
					imgView.setImageResource(R.drawable.rehrassahib23);
					break;
				case 23:
					imgView.setImageResource(R.drawable.rehrassahib24);
					break;
				case 24:
					imgView.setImageResource(R.drawable.rehrassahib25);
					break;
				case 25:
					imgView.setImageResource(R.drawable.rehrassahib26);
					break;
				case 26:
					imgView.setImageResource(R.drawable.rehrassahib27);
					break;
				case 27:
					imgView.setImageResource(R.drawable.rehrassahib28);
					break;
				case 28:
					imgView.setImageResource(R.drawable.rehrassahib29);
					break;
				case 29:
					imgView.setImageResource(R.drawable.rehrassahib30);
					break;
				case 30:
					imgView.setImageResource(R.drawable.rehrassahib31);
					break;
				case 31:
					imgView.setImageResource(R.drawable.rehrassahib32);
					break;
				case 32:
					imgView.setImageResource(R.drawable.rehrassahib33);
					break;
				case 33:
					imgView.setImageResource(R.drawable.rehrassahib34);
					break;
				case 34:
					imgView.setImageResource(R.drawable.rehrassahib35);
					break;
				case 35:
					imgView.setImageResource(R.drawable.rehrassahib36);
					break;
				case 36:
					imgView.setImageResource(R.drawable.rehrassahib37);
					break;
				case 37:
					imgView.setImageResource(R.drawable.rehrassahib38);
					break;
				case 38:
					imgView.setImageResource(R.drawable.rehrassahib39);
					break;
				case 39:
					imgView.setImageResource(R.drawable.rehrassahib40);
					break;
				case 40:
					imgView.setImageResource(R.drawable.rehrassahib41);
					break;
				case 41:
					imgView.setImageResource(R.drawable.rehrassahib42);
					break;
				case 42:
					imgView.setImageResource(R.drawable.rehrassahib43);
					break;
				case 43:
					imgView.setImageResource(R.drawable.rehrassahib44);
					break;
				case 44:
					imgView.setImageResource(R.drawable.rehrassahib45);
					break;
				case 45:
					imgView.setImageResource(R.drawable.rehrassahib46);
					break;
				case 46:
					imgView.setImageResource(R.drawable.rehrassahib47);
					break;
				case 47:
					imgView.setImageResource(R.drawable.rehrassahib48);
					break;
				case 48:
					imgView.setImageResource(R.drawable.rehrassahib49);
					break;
				case 49:
					imgView.setImageResource(R.drawable.rehrassahib50);
					break;
				case 50:
					imgView.setImageResource(R.drawable.rehrassahib51);
					break;
				default:
					imgView.setImageResource(R.drawable.rehrassahib01);
					break;
				}
			}
		});
	}

	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(RehrasSahib.this,
				ReadGurbaniList.class);
		RehrasSahib.this.startActivity(activityIntent);
		finish();

	}
}
