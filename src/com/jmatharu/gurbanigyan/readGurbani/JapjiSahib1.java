package com.jmatharu.gurbanigyan.readGurbani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.jmatharu.gurbanigyan.R;

public class JapjiSahib1 extends Activity {
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_japji_sahib1);

		final ImageView imgView = (ImageView) findViewById(R.id.imJapjiSahib);
		imgView.setImageResource(R.drawable.japjisahib01);

		Button bLast = (Button) findViewById(R.id.button1);
		Button bNext = (Button) findViewById(R.id.button2);

		bLast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				switch (counter) {
				case 3:
					imgView.setImageResource(R.drawable.japjisahib04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.japjisahib05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.japjisahib06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.japjisahib07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.japjisahib08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.japjisahib09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.japjisahib10);
					break;
				case 10:
					imgView.setImageResource(R.drawable.japjisahib11);
					break;
				case 11:
					imgView.setImageResource(R.drawable.japjisahib12);
					break;
				case 12:
					imgView.setImageResource(R.drawable.japjisahib13);
					break;
				case 13:
					imgView.setImageResource(R.drawable.japjisahib14);
					break;
				case 14:
					imgView.setImageResource(R.drawable.japjisahib15);
					break;
				case 15:
					imgView.setImageResource(R.drawable.japjisahib16);
					break;
				case 16:
					imgView.setImageResource(R.drawable.japjisahib17);
					break;
				case 17:
					imgView.setImageResource(R.drawable.japjisahib18);
					break;
				case 18:
					imgView.setImageResource(R.drawable.japjisahib19);
					break;
				case 19:
					imgView.setImageResource(R.drawable.japjisahib20);
					break;
				case 20:
					imgView.setImageResource(R.drawable.japjisahib21);
					break;
				case 21:
					imgView.setImageResource(R.drawable.japjisahib22);
					break;
				case 22:
					imgView.setImageResource(R.drawable.japjisahib23);
					break;
				case 23:
					imgView.setImageResource(R.drawable.japjisahib24);
					break;
				case 24:
					imgView.setImageResource(R.drawable.japjisahib25);
					break;
				case 25:
					imgView.setImageResource(R.drawable.japjisahib26);
					break;
				case 26:
					imgView.setImageResource(R.drawable.japjisahib27);
					break;
				case 27:
					imgView.setImageResource(R.drawable.japjisahib28);
					break;
				case 28:
					imgView.setImageResource(R.drawable.japjisahib29);
					break;
				case 29:
					imgView.setImageResource(R.drawable.japjisahib30);
					break;
				case 30:
					imgView.setImageResource(R.drawable.japjisahib31);
					break;
				case 31:
					imgView.setImageResource(R.drawable.japjisahib32);
					break;
				case 32:
					imgView.setImageResource(R.drawable.japjisahib33);
					break;
				case 33:
					imgView.setImageResource(R.drawable.japjisahib34);
					break;
				case 34:
					imgView.setImageResource(R.drawable.japjisahib35);
					break;
				case 35:
					imgView.setImageResource(R.drawable.japjisahib36);
					break;
				case 36:
					imgView.setImageResource(R.drawable.japjisahib37);
					break;
				case 37:
					imgView.setImageResource(R.drawable.japjisahib38);
					break;
				case 38:
					imgView.setImageResource(R.drawable.japjisahib39);
					break;
				case 39:
					imgView.setImageResource(R.drawable.japjisahib40);
					break;
				case 40:
					imgView.setImageResource(R.drawable.japjisahib41);
					break;
				case 41:
					imgView.setImageResource(R.drawable.japjisahib42);
					break;
				case 42:
					imgView.setImageResource(R.drawable.japjisahib43);
					break;
				case 43:
					imgView.setImageResource(R.drawable.japjisahib44);
					break;
				case 44:
					imgView.setImageResource(R.drawable.japjisahib45);
					break;
				case 45:
					imgView.setImageResource(R.drawable.japjisahib46);
					break;
				case 46:
					imgView.setImageResource(R.drawable.japjisahib47);
					break;
				case 47:
					imgView.setImageResource(R.drawable.japjisahib48);
					break;
				case 48:
					imgView.setImageResource(R.drawable.japjisahib49);
					break;
				case 49:
					imgView.setImageResource(R.drawable.japjisahib50);
					break;
				case 50:
					imgView.setImageResource(R.drawable.japjisahib51);
					break;
				case 51:
					imgView.setImageResource(R.drawable.japjisahib52);
					break;
				case 52:
					imgView.setImageResource(R.drawable.japjisahib53);
					break;
				case 53:
					imgView.setImageResource(R.drawable.japjisahib54);
					break;
				case 54:
					imgView.setImageResource(R.drawable.japjisahib55);
					break;
				case 55:
					imgView.setImageResource(R.drawable.japjisahib56);
					break;
				case 56:
					imgView.setImageResource(R.drawable.japjisahib57);
					break;
				case 2:
					imgView.setImageResource(R.drawable.japjisahib03);
					break;
				case 1:
					imgView.setImageResource(R.drawable.japjisahib02);
					break;
				default:
					imgView.setImageResource(R.drawable.japjisahib01);
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
					imgView.setImageResource(R.drawable.japjisahib02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.japjisahib03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.japjisahib04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.japjisahib05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.japjisahib06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.japjisahib07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.japjisahib08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.japjisahib09);
					break;
				case 9:
					imgView.setImageResource(R.drawable.japjisahib10);
					break;
				case 10:
					imgView.setImageResource(R.drawable.japjisahib11);
					break;
				case 11:
					imgView.setImageResource(R.drawable.japjisahib12);
					break;
				case 12:
					imgView.setImageResource(R.drawable.japjisahib13);
					break;
				case 13:
					imgView.setImageResource(R.drawable.japjisahib14);
					break;
				case 14:
					imgView.setImageResource(R.drawable.japjisahib15);
					break;
				case 15:
					imgView.setImageResource(R.drawable.japjisahib16);
					break;
				case 16:
					imgView.setImageResource(R.drawable.japjisahib17);
					break;
				case 17:
					imgView.setImageResource(R.drawable.japjisahib18);
					break;
				case 18:
					imgView.setImageResource(R.drawable.japjisahib19);
					break;
				case 19:
					imgView.setImageResource(R.drawable.japjisahib20);
					break;
				case 20:
					imgView.setImageResource(R.drawable.japjisahib21);
					break;
				case 21:
					imgView.setImageResource(R.drawable.japjisahib22);
					break;
				case 22:
					imgView.setImageResource(R.drawable.japjisahib23);
					break;
				case 23:
					imgView.setImageResource(R.drawable.japjisahib24);
					break;
				case 24:
					imgView.setImageResource(R.drawable.japjisahib25);
					break;
				case 25:
					imgView.setImageResource(R.drawable.japjisahib26);
					break;
				case 26:
					imgView.setImageResource(R.drawable.japjisahib27);
					break;
				case 27:
					imgView.setImageResource(R.drawable.japjisahib28);
					break;
				case 28:
					imgView.setImageResource(R.drawable.japjisahib29);
					break;
				case 29:
					imgView.setImageResource(R.drawable.japjisahib30);
					break;
				case 30:
					imgView.setImageResource(R.drawable.japjisahib31);
					break;
				case 31:
					imgView.setImageResource(R.drawable.japjisahib32);
					break;
				case 32:
					imgView.setImageResource(R.drawable.japjisahib33);
					break;
				case 33:
					imgView.setImageResource(R.drawable.japjisahib34);
					break;
				case 34:
					imgView.setImageResource(R.drawable.japjisahib35);
					break;
				case 35:
					imgView.setImageResource(R.drawable.japjisahib36);
					break;
				case 36:
					imgView.setImageResource(R.drawable.japjisahib37);
					break;
				case 37:
					imgView.setImageResource(R.drawable.japjisahib38);
					break;
				case 38:
					imgView.setImageResource(R.drawable.japjisahib39);
					break;
				case 39:
					imgView.setImageResource(R.drawable.japjisahib40);
					break;
				case 40:
					imgView.setImageResource(R.drawable.japjisahib41);
					break;
				case 41:
					imgView.setImageResource(R.drawable.japjisahib42);
					break;
				case 42:
					imgView.setImageResource(R.drawable.japjisahib43);
					break;
				case 43:
					imgView.setImageResource(R.drawable.japjisahib44);
					break;
				case 44:
					imgView.setImageResource(R.drawable.japjisahib45);
					break;
				case 45:
					imgView.setImageResource(R.drawable.japjisahib46);
					break;
				case 46:
					imgView.setImageResource(R.drawable.japjisahib47);
					break;
				case 47:
					imgView.setImageResource(R.drawable.japjisahib48);
					break;
				case 48:
					imgView.setImageResource(R.drawable.japjisahib49);
					break;
				case 49:
					imgView.setImageResource(R.drawable.japjisahib50);
					break;
				case 50:
					imgView.setImageResource(R.drawable.japjisahib51);
					break;
				case 51:
					imgView.setImageResource(R.drawable.japjisahib52);
					break;
				case 52:
					imgView.setImageResource(R.drawable.japjisahib53);
					break;
				case 53:
					imgView.setImageResource(R.drawable.japjisahib54);
					break;
				case 54:
					imgView.setImageResource(R.drawable.japjisahib55);
					break;
				case 55:
					imgView.setImageResource(R.drawable.japjisahib56);
					break;
				case 56:
					imgView.setImageResource(R.drawable.japjisahib57);
					break;
				default:
					imgView.setImageResource(R.drawable.japjisahib01);
					break;
				}
			}
		});
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(JapjiSahib1.this,
				ReadGurbaniList.class);
		JapjiSahib1.this.startActivity(activityIntent);
		finish();
	}

}
