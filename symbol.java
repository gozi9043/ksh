package hkit.kr.myapplication;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Window;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class symbol extends Activity {
public final static  String VIDEO_URL = "https://blog.naver.com/gozi9043/221408559167";
public final static int URL = 1;
public final  static int SDCARD = 2;
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_symbol);

    videoView = (VideoView) findViewById(R.id.v1);

        int type = URL;
    switch (type) {
        case URL:
            videoView.setVideoURI(Uri.parse(VIDEO_URL));
            break;
    }
MediaController controller = new MediaController(this);
    videoView.setMediaController(controller);

    videoView.requestFocus();
    videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
        @Override
        public void onPrepared(MediaPlayer mp) {
            Toast.makeText(getApplicationContext(),
                    "동영상이 준비되었습니다.\n'재생' 버튼을 누르세요.", Toast.LENGTH_LONG)
                    .show();
        }
    });


        }

    }
}
