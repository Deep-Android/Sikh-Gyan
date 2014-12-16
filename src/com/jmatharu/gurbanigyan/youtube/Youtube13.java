package com.jmatharu.gurbanigyan.youtube;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import com.jmatharu.gurbanigyan.IndexPage;
import com.jmatharu.gurbanigyan.R;

public class Youtube13 extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener {
	static private final String DEVELOPER_KEY = "AIzaSyAtqdhiy9NVwbw1rEN5DKRS5m7NK6ziO70";
	static private final String VIDEO = "U6vI7ukGoaI";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_youtube13);
		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view13);
		youTubeView.initialize(DEVELOPER_KEY, this);
	}

	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Oh no! " + arg1.toString(), Toast.LENGTH_LONG)
				.show();

	}

	@Override
	public void onInitializationSuccess(Provider arg0, YouTubePlayer arg1,
			boolean arg2) {
		// TODO Auto-generated method stub
		arg1.loadVideo(VIDEO);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(Youtube13.this,
				IndexPage.class);
		Youtube13.this.startActivity(activityIntent);
		finish();
	}
}
