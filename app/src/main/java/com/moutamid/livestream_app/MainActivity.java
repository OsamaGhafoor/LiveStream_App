package com.moutamid.livestream_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.webilisim.webplayer.WEBPlayer;
import net.webilisim.webplayer.WEBPlayerStd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WEBPlayerStd webPlayerStd = findViewById(R.id.webplayer);
        // paste your link of live stream here & 2nd our channel name
        // http://radio-live-mg.rtr-vesti.ru/live/smil:r1.smil/variant.m3u8
        // link is provided in description
        webPlayerStd.setUp("http://radio-live-mg.rtr-vesti.ru/live/smil:r1.smil/variant.m3u8", "OUR LIVE CHANNEL");
    }

    @Override
    public void onBackPressed() {
        if (WEBPlayer.backPress()) {
            return;
        }
        super.onBackPressed();
    }
    @Override
    protected void onPause() {
        super.onPause();
        WEBPlayer.releaseAllVideos();
    }

    // video of live stream can be played according to the speed of net
    // Thanks for watching
}