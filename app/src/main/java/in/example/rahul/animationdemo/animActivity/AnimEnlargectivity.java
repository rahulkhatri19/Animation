package in.example.rahul.animationdemo.animActivity;

import android.animation.LayoutTransition;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import in.example.rahul.animationdemo.R;

public class AnimEnlargectivity extends AppCompatActivity {
    TextView tvAnim;
    Button btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_enlargectivity);
        tvAnim = findViewById(R.id.tv_anim);
        btnAnim = findViewById(R.id.btn_anim);
        tvAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ((ViewGroup) findViewById(R.id.llRoot)).getLayoutTransition()
                //          .enableTransitionType(LayoutTransition.CHANGING);
                ((ViewGroup) findViewById(R.id.rl_root)).getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
                tvAnim.setText("Text Incresed to Big Text");
            }
        });

        btnAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ViewGroup) findViewById(R.id.rl_root)).getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
                btnAnim.setText("Text Incresed to Big Text");
            }
        });
    }
}
