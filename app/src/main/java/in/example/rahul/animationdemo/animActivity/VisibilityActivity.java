package in.example.rahul.animationdemo.animActivity;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.CycleInterpolator;
import android.widget.Button;
import android.widget.TextView;

import in.example.rahul.animationdemo.R;

public class VisibilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility);
        // Here we make text visible and  invisible.
        final ViewGroup transitionContainer= (ViewGroup)findViewById(R.id.transition_container);
        final TextView text=(TextView)transitionContainer.findViewById(R.id.text);
        final Button button= (Button)transitionContainer.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    TransitionManager.beginDelayedTransition(transitionContainer);
                }
                visible= !visible;
                text.setVisibility(visible ? View.VISIBLE: View.GONE);

            }
        });
    }
    public void visibleInvisible(View view){
        CycleInterpolator ci = new CycleInterpolator(5f);
        ViewPropertyAnimator anim = view.animate();
        anim.alpha(0);
        anim.setDuration(10000);
        anim.setInterpolator(ci);
    }
}
