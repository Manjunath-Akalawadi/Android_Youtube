package com.manju7.youtube_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerViewV;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    Button buttonV ;
    public static final String API_KEY = "AIzaSyAx0Ns3uNQ1DRxw-TVF6KG4gRDAd7UjJCA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerViewV = (YouTubePlayerView) findViewById(R.id.youtubeV);
        buttonV =(Button) findViewById(R.id.buttonV);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("kJQP7kiw5Fk");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        buttonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                youTubePlayerViewV.initialize(API_KEY,onInitializedListener);
            }
        });

    }
}
