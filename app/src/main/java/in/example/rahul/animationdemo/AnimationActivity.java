package in.example.rahul.animationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import in.example.rahul.animationdemo.animActivity.HomeActivity;
import in.example.rahul.animationdemo.animActivity.ShimmerActivity;

public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }

    public void btnBlink(View view) {
        openAnimation(1);
    }

    public void btnBounce(View view) {
        openAnimation(2);
    }

    public void btnFadeIn(View view) {
        openAnimation(3);
    }

    public void btnFadeOut(View view) {
        openAnimation(4);
    }

    public void btnMove(View view) {
        openAnimation(5);
    }

    public void btnRotate(View view) {
        openAnimation(6);
    }

    public void btnSeq(View view) {
        openAnimation(7);
    }

    public void btnSlideD(View view) {
        openAnimation(8);
    }

    public void btnSlideU(View view) {
        openAnimation(9);
    }

    public void btnTogether(View view) {
        openAnimation(10);
    }

    public void btnZoomIn(View view) {
        openAnimation(11);
    }

    public void btnZoomOut(View view) {
        openAnimation(12);
    }

    public void shimmerLayout(View view){
        startActivity(new Intent(AnimationActivity.this, ShimmerActivity.class));
    }

    private void openAnimation(int aniCode) {
        startActivity(new Intent(AnimationActivity.this, HomeActivity.class).putExtra("aniCode", aniCode));
    }
}
