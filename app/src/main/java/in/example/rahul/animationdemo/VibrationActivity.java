package in.example.rahul.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class VibrationActivity extends AppCompatActivity {
    Button button;
    ImageView callImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);

        button= findViewById(R.id.btn);
        callImage= findViewById(R.id.iv_call);
    }
    public void vibrationImage(View view){
        Animation vibration= AnimationUtils.loadAnimation(this, R.anim.vibrate);
        view.startAnimation(vibration);
    }
    public void vibrationBoth(View view){
        Animation vibration= AnimationUtils.loadAnimation(this, R.anim.vibrate);
        button.startAnimation(vibration);
        callImage.startAnimation(vibration);
    }
    public void vibrationBtn(View view){
        Animation vibration= AnimationUtils.loadAnimation(this, R.anim.vibrate2);
        view.startAnimation(vibration);
    }
}
