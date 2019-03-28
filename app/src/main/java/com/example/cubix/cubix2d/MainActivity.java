package com.example.cubix.cubix2d;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.D_Code.NewCubix.UnityPlayerActivity;


public class MainActivity extends AppCompatActivity
{
    int ch = 0;
    Button b,b1,b2,b3;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.music);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.hanch.gameprojectupdated.Main2Activity");
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                Intent intent = new Intent(MainActivity.this, UnityPlayerActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Pop.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch%2==0)
                {
                    mediaPlayer.start();
                    ch++;
                }
                else
                {
                    mediaPlayer.pause();
                    ch++;
                }
            }
        });
    }
    /*public void call(boolean x)
    {
        if(x == true){
            Intent intent = new Intent(this, UnityPlayerActivity.class);
            startActivity(intent);
        }
    }*/
}
