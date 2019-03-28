package com.example.cubix.cubix2d;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;

//import com.D_Code.NewCubix.UnityPlayerActivity;

public class Main2Activity extends Activity {
    ObstacleManager obstacleManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        Constants.SCREEN_WIDTH = dm.widthPixels;
        Constants.SCREEN_HEIGHT = dm.heightPixels;
        setContentView(new GamePanel(this));
    }

    /*public void call(boolean x)
    {
        if(x == true){
            finish();
            Intent intent = new Intent(this, UnityPlayerActivity.class);
            startActivity(intent);
        }
    }*/
}
