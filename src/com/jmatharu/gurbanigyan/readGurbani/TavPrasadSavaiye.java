package com.jmatharu.gurbanigyan.readGurbani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.jmatharu.gurbanigyan.R;

public class TavPrasadSavaiye extends Activity {
	int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tav_prasad_savaiye);

		final ImageView imgView = (ImageView) findViewById(R.id.imTavPrasadSavaiye);
		imgView.setImageResource(R.drawable.tavprasadsavaiye01);

		Button bLast = (Button) findViewById(R.id.buttonLast3);
		Button bNext = (Button) findViewById(R.id.buttonNext3);

		bLast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				switch (counter) {
				case 1:
					imgView.setImageResource(R.drawable.tavprasadsavaiye02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.tavprasadsavaiye03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.tavprasadsavaiye04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.tavprasadsavaiye05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.tavprasadsavaiye06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.tavprasadsavaiye07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.tavprasadsavaiye08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.tavprasadsavaiye09);
					break;
				default:
					imgView.setImageResource(R.drawable.tavprasadsavaiye01);
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
					imgView.setImageResource(R.drawable.tavprasadsavaiye02);
					break;
				case 2:
					imgView.setImageResource(R.drawable.tavprasadsavaiye03);
					break;
				case 3:
					imgView.setImageResource(R.drawable.tavprasadsavaiye04);
					break;
				case 4:
					imgView.setImageResource(R.drawable.tavprasadsavaiye05);
					break;
				case 5:
					imgView.setImageResource(R.drawable.tavprasadsavaiye06);
					break;
				case 6:
					imgView.setImageResource(R.drawable.tavprasadsavaiye07);
					break;
				case 7:
					imgView.setImageResource(R.drawable.tavprasadsavaiye08);
					break;
				case 8:
					imgView.setImageResource(R.drawable.tavprasadsavaiye09);
					break;
				default:
					imgView.setImageResource(R.drawable.tavprasadsavaiye01);
					break;
				}
			}
		});

	}

	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(TavPrasadSavaiye.this,
				ReadGurbaniList.class);
		TavPrasadSavaiye.this.startActivity(activityIntent);
		finish();

	}
}