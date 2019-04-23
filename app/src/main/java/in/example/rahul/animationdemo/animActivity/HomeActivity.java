package in.example.rahul.animationdemo.animActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import in.example.rahul.animationdemo.R;

public class HomeActivity extends AppCompatActivity {
    Button btnSubmit;
    TextView tvAnimation;
    Animation blink, bounce, fadeIn, fadeOut, move, rotate, seq, slideD, slideU, together, zoomIn, zoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSubmit= findViewById(R.id.btn_submit);
        tvAnimation= findViewById(R.id.tv_anim);

        blink= AnimationUtils.loadAnimation(this, R.anim.blink);
       bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
       fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
       fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
       move = AnimationUtils.loadAnimation(this, R.anim.move);
       rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
       seq = AnimationUtils.loadAnimation(this, R.anim.sequential);
       slideD = AnimationUtils.loadAnimation(this, R.anim.slide_down);
       slideU = AnimationUtils.loadAnimation(this, R.anim.slide_up);
       together = AnimationUtils.loadAnimation(this, R.anim.together);
       zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
       zoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tvHello.setText("Hi I am working");
                String aniCode = "";
                // aniCode= getIntent().getIntExtra("aniCode");
                int intAni = getIntent().getIntExtra("aniCode", 0);// Integer.parseInt(aniCode);
                switch (intAni) {
                    case 0:
                        Toast.makeText(HomeActivity.this, "Didn't get any Value", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        tvAnimation.startAnimation(blink);
                        break;
                    case 2:
                        tvAnimation.startAnimation(bounce);
                        break;
                    case 3:
                        tvAnimation.startAnimation(fadeIn);
                        break;
                    case 4:
                        tvAnimation.startAnimation(fadeOut);
                        break;
                    case 5:
                        tvAnimation.startAnimation(move);
                        break;
                    case 6:
                        tvAnimation.startAnimation(rotate);
                        break;
                    case 7:
                        tvAnimation.startAnimation(seq);
                        break;
                    case 8:
                        tvAnimation.startAnimation(slideD);
                        break;
                    case 9:
                        tvAnimation.startAnimation(slideU);
                        break;
                    case 10:
                        tvAnimation.startAnimation(together);
                        break;
                    case 11:
                        tvAnimation.startAnimation(zoomIn);
                        break;
                    case 12:
                        tvAnimation.startAnimation(zoomOut);
                        break;
                    default:
                        Toast.makeText(HomeActivity.this, "No Animation", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
