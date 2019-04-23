package in.example.rahul.animationdemo.animActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.example.rahul.animationdemo.R;

public class RippleEffect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple_effect);
        // Method 1 we use background attr and button transparent.
        // Method 2 Here we use drawable/ripple.xml file in background
    }
}
