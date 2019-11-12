package `in`.example.rahul.animationdemo.animActivity

import `in`.example.rahul.animationdemo.model.Movie
import `in`.example.rahul.animationdemo.R
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shimmer.*
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_shimmer.recycleView
import kotlinx.android.synthetic.main.movie_layout.view.*


class ShimmerActivity : AppCompatActivity() {

    var movieList: MutableList<Movie> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shimmer)
        shimmer_layout.startShimmer()
        recycleView.setHasFixedSize(true)
        prepareMovieData()
        recycleView.visibility = View.GONE
        shimmer_layout.visibility = View.VISIBLE
//        Crating api fetching like effect
        Handler().postDelayed({
            recycleView.visibility = View.VISIBLE
            recycleView.layoutManager = LinearLayoutManager(this)
            recycleView.adapter = MovieAdapter(movieList, this)
            shimmer_layout.stopShimmer()
            shimmer_layout.visibility = View.GONE
        }, 2000)

    }

    private fun prepareMovieData() {
        var movie = Movie("Mad Max: Fury Road", "Action & Adventure", "2015")
        movieList.add(movie)

        movie = Movie("Inside Out", "Animation, Kids & Family", "2015")
        movieList.add(movie)

        movie = Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        movieList.add(movie)

        movie = Movie("Shaun the Sheep", "Animation", "2015")
        movieList.add(movie)

        movie = Movie("The Martian", "Science Fiction & Fantasy", "2015")
        movieList.add(movie)

        movie = Movie("Mission: Impossible Rogue Nation", "Action", "2015")
        movieList.add(movie)

        movie = Movie("Up", "Animation", "2009")
        movieList.add(movie)

        movie = Movie("Star Trek", "Science Fiction", "2009")
        movieList.add(movie)

        movie = Movie("The LEGO Movie", "Animation", "2014")
        movieList.add(movie)

        movie = Movie("Iron Man", "Action & Adventure", "2008")
        movieList.add(movie)

        movie = Movie("Aliens", "Science Fiction", "1986")
        movieList.add(movie)

        movie = Movie("Chicken Run", "Animation", "2000")
        movieList.add(movie)

        movie = Movie("Back to the Future", "Science Fiction", "1985")
        movieList.add(movie)

        movie = Movie("Raiders of the Lost Ark", "Action & Adventure", "1981")
        movieList.add(movie)

        movie = Movie("Goldfinger", "Action & Adventure", "1965")
        movieList.add(movie)

        movie = Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
        movieList.add(movie)
    }

    override fun onResume() {
        super.onResume()
        shimmer_layout.startShimmer()
    }

    override fun onPause() {
        shimmer_layout.stopShimmer()
        super.onPause()
    }

    class MovieAdapter(val list: MutableList<Movie>, val context: Context) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
        override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(context).inflate(R.layout.movie_layout, p0, false))
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val dataList: Movie = list.get(position)
            holder.tvTitle.text = dataList.title
            holder.tvDes.text = dataList.genre
            holder.tvYear.text = dataList.year
        }

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            val tvTitle = view.tv_title
            val tvDes = view.tv_des
            val tvYear = view.tv_year
        }
    }
}
