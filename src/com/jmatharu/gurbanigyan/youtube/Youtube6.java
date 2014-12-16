package com.jmatharu.gurbanigyan.youtube;

import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.jmatharu.gurbanigyan.R;

public class Youtube6 extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener {
	static private final String DEVELOPER_KEY = "AIzaSyAtqdhiy9NVwbw1rEN5DKRS5m7NK6ziO70";
	static private final String VIDEO = "2e4VwJmy65A";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_youtube6);
		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view6);
		youTubeView.initialize(DEVELOPER_KEY, this);
	}

	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		// TODO Auto-generated method stub
		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view1);
		youTubeView.initialize(DEVELOPER_KEY, this);
	}

	@Override
	public void onInitializationSuccess(Provider arg0, YouTubePlayer arg1,
			boolean arg2) {
		// TODO Auto-generated method stub
		arg1.loadVideo(VIDEO);
	}
}
