package in.example.rahul.animationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.example.rahul.animationdemo.animActivity.AnimEnlargectivity;
import in.example.rahul.animationdemo.animActivity.BubbleButton;
import in.example.rahul.animationdemo.animActivity.ImageClick;
import in.example.rahul.animationdemo.animActivity.RippleEffect;
import in.example.rahul.animationdemo.animActivity.SharedElement;
import in.example.rahul.animationdemo.animActivity.TransitionActivity;
import in.example.rahul.animationdemo.animActivity.VibrationActivity;
import in.example.rahul.animationdemo.animActivity.ViewAnimation;
import in.example.rahul.animationdemo.animActivity.VisibilityActivity;

public class MainActivity extends AppCompatActivity {

    Button btnBubbleEffect, btnImageClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBubbleEffect = findViewById(R.id.btn_bubble);
        btnImageClick = findViewById(R.id.imgclick);

        btnBubbleEffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BubbleButton.class);
                startActivity(intent);
            }
        });
        btnImageClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageClick.class);
                startActivity(intent);
            }
        });

    }

    public void shared(View view) {
        startActivity(new Intent(this, SharedElement.class));
    }

    public void viewAni(View view) {
        startActivity(new Intent(this, ViewAnimation.class));
    }

    public void transi(View view) {
        startActivity(new Intent(this, TransitionActivity.class));
    }

    public void ripple(View view) {
        startActivity(new Intent(this, RippleEffect.class));
    }

    public void visi(View view) {
        startActivity(new Intent(this, VisibilityActivity.class));
    }

    public void vibration(View view) {
        startActivity(new Intent(this, VibrationActivity.class));
    }

    public void btnMoreAnim(View view) {
        startActivity(new Intent(this, AnimationActivity.class));
    }

    public void btnEnlarge(View view) {
        startActivity(new Intent(this, AnimEnlargectivity.class));
    }


}

