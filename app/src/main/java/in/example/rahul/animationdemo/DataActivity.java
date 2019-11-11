package in.example.rahul.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.facebook.shimmer.ShimmerFrameLayout;

import retrofit2.Retrofit;

public class DataActivity extends AppCompatActivity {

    private ShimmerFrameLayout mShimmerViewContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        mShimmerViewContainer = findViewById(R.id.shimmer_view_container);

        // I am using Retrofit Client for fetching data from an API.
        // API Call Using Retrofit Client
        String userId = "XXXX";
        Retrofit retrofit = RetrofitClient.getClient();
        getPlaylists(userId, retrofit);
    }
    private void getPlaylists(String userId, Retrofit retrofit) {

        ApiServices apiServices = retrofit.create(ApiServices.class);
        Call<List<Playlist>> accountPlaylists = apiServices.getAccountPlaylists(userId);

        accountPlaylists.enqueue(new Callback<List<Playlist>>() {
            @Override
            public void onResponse(Call<List<Playlist>> call, Response<List<Playlist>> response) {
                if (response.isSuccessful()) {
                    if (response.code() == 200) {

                        //TODO: Set data in ListView

                    }
                    // Stopping Shimmer Effect's animation after data is loaded to ListView
                    mShimmerViewContainer.stopShimmerAnimation();
                    mShimmerViewContainer.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Playlist>> call, Throwable t) {
                Log.e("TAG", "=======onFailure: " + t.toString());
                t.printStackTrace();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mShimmerViewContainer.startShimmer();
    }

    @Override
    protected void onPause() {
        mShimmerViewContainer.stopShimmer();
        super.onPause();
    }
}
