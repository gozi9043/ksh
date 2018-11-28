package hkit.kr.a1;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    PlayView playView;
    ImageButton rightImageButton;
    ImageButton leftImageButton;
    ImageButton downImageButton;
    ImageButton upImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playView = findViewById(R.id.contorl);


        rightImageButton = findViewById(R.id.rightImageButton);
        rightImageButton.setOnClickListener(rightListener);
        leftImageButton = findViewById(R.id.leftImageButton);
        leftImageButton.setOnClickListener(leftListener);
        downImageButton = findViewById(R.id.downImageButton);
        downImageButton.setOnClickListener(downListener);
        upImageButton = findViewById(R.id.upImageButton);
        upImageButton.setOnClickListener(upListener);
    }

    View.OnClickListener contorl = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        }
    };

    View.OnClickListener rightListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            playView.right();

        }
    };
    View.OnClickListener leftListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            playView.left();

        }
    };
    View.OnClickListener upListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            playView.up();
        }
    };
    View.OnClickListener downListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            playView.down();

        }
    };
}
