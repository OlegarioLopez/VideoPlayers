package ole.apps.videoplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class vimeoPlayer extends AppCompatActivity {
   private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){};
        setContentView(R.layout.activity_vimeo_player);
        myWebView=(WebView)findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadDataWithBaseURL("https://vimeo.com/47412289","<iframe src=\"https://player.vimeo.com/video/47412289\" width=\"100%\" height=\"100%\" frameborder=\"0\"></iframe>","text/html", "utf-8",null);


    }
}
