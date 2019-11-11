package `in`.example.rahul.animationdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        //
        ClientInterface.create().getGameData().enqueue(object : Callback<GameModel> {
            override fun onFailure(call: Call<GameModel>, t: Throwable) {
                Log.e("error: ", t.message)
            }

            override fun onResponse(call: Call<GameModel>, response: Response<GameModel>) {

                val list: ArrayList<GameDetailModel> = response.body()?.gameList!!

                recycleView.layoutManager= LinearLayoutManager(this)
                recycleView.adapter= GameRetrofitAdapter( list,this)
            }
        })
    }

}