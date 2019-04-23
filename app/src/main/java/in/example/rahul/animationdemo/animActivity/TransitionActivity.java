package in.example.rahul.animationdemo.animActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.example.rahul.animationdemo.R;

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        overridePendingTransition(R.anim.slidein,R.anim.slideout);
    }

    @Override
    protected void onPause() {
        super.onPause();

        overridePendingTransition(R.anim.slidein,R.anim.slideout);
    }
}
