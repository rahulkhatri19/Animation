package in.example.rahul.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class BubbleButton extends AppCompatActivity {

    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_button);
        button=(Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation animation= AnimationUtils.loadAnimation(BubbleButton.this,R.anim.bubble);

                BounceInterpolator bounceInterpolator = new BounceInterpolator(0.2,20);
                animation.setInterpolator(bounceInterpolator);
                button.startAnimation(animation);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation animation= AnimationUtils.loadAnimation(BubbleButton.this,R.anim.bubble);

                BounceInterpolator bounceInterpolator = new BounceInterpolator(0.2,20);
                animation.setInterpolator(bounceInterpolator);
                imageView.startAnimation(animation);
            }
        });
    }
}
