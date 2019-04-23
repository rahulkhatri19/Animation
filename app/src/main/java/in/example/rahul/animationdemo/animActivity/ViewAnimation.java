package in.example.rahul.animationdemo.animActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import in.example.rahul.animationdemo.R;

public class ViewAnimation extends AppCompatActivity implements Animation.AnimationListener {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Here imageanimator.xml help us
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
        imageView= (ImageView)findViewById(R.id.imageView2);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.imageanimaton);
        animation.setAnimationListener(this);
        imageView.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
