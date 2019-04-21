package in.example.rahul.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RippleEffect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_effect);
        // Method 1 we use background attr and button transparent.
        // Method 2 Here we use drawable/ripple.xml file in background
    }
}
