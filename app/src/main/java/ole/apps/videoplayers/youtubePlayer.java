package ole.apps.videoplayers;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class youtubePlayer extends YouTubeBaseActivity {

    public static final String DEVELOPER_KEY = "AIzaSyAmjyTLHxB9dscdsmu7JK7l24JBrg1Ojvg";
    private String url;
    private YouTubePlayerView player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_reproductor);
        Bundle extras = getIntent().getExtras();
        url = extras.getString("url");
        player=(YouTubePlayerView)findViewById(R.id.YoutubePlayer);
        player.initialize(DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(!b){
                    youTubePlayer.loadVideo(url);
                    youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(youtubePlayer.this, youTubeInitializationResult.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
