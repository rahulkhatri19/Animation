package in.example.rahul.animationdemo.animActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import in.example.rahul.animationdemo.R;

public class SharedElement extends AppCompatActivity {
        ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element);
        imageView=(ImageView)findViewById(R.id.imageView);
// Logic is one image in this and another same image in next empty Activity.
        // Next image is Big.
    }
    public void SharedAction(View view){
        Intent intent=new Intent(SharedElement.this,EmptyActivity.class);
        Bundle bundle=null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            bundle= ActivityOptions.makeSceneTransitionAnimation(SharedElement.this,imageView,imageView.getTransitionName()).toBundle();
            startActivity(intent,bundle);
        }
    }
}
