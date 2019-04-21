package in.example.rahul.animationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btn_bubble);
        b2=(Button)findViewById(R.id.imgclick);
        b3=(Button)findViewById(R.id.shared);
        b4=(Button)findViewById(R.id.viewAni);
        b5=(Button)findViewById(R.id.transi);
       // b3=(Button)findViewById(R.id.);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BubbleButton.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ImageClick.class);
                startActivity(intent);
            }
        });

    }
    public void shared(View view){
        startActivity(new Intent(this,SharedElement.class));
    }
    public void viewAni(View view){
        startActivity(new Intent(this,ViewAnimation.class));
    }
    public void transi(View view){
        startActivity(new Intent(this,TransitionActivity.class));
    }
    public void ripple(View view){
        startActivity(new Intent(this,RippleEffect.class));
    }
    public void visi(View view){
        startActivity(new Intent(this,VisibilityActivity.class));
    }
    public void vibration(View view){
        startActivity(new Intent(this, VibrationActivity.class));
    }


    }

