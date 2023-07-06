package com.example.cineaste.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cineaste.R
import com.example.cineaste.data.GetSimilarResponse
import com.example.cineaste.data.Movie
import com.example.cineaste.data.MovieRepository
import com.example.cineaste.viewmodel.MovieDetailViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


class SimilarFragment() : Fragment() {

    private lateinit var similarRV:RecyclerView
    private var movieList= listOf<Movie>()
    private lateinit var similarRVSimpleAdapter: SimpleSimilarStringAdapter
    private var movieDetailViewModel =  MovieDetailViewModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater.inflate(R.layout.fragment_similar, container, false)
        val intent = requireActivity().intent
        val extras = intent.extras

        if (extras != null) {
            if (extras.containsKey("movie_id") && !extras.containsKey("exists") ){
                movieDetailViewModel.getSimilarMoviesById(extras.getLong("movie_id"),onSuccess = ::onSuccess,onError = ::onError)
            }
            else if (extras.containsKey("movie_id") && extras.containsKey("exists") ){
                movieDetailViewModel.getSimilarMoviesByIdDB(requireContext(),extras.getLong("movie_id"),onSuccess = ::onSuccess,onError = ::onError)
            }
        }

        similarRV = view.findViewById<RecyclerView>(R.id.listSimilar)
        similarRV.layoutManager = LinearLayoutManager(activity)
        similarRVSimpleAdapter = SimpleSimilarStringAdapter(movieList)
        similarRV.adapter = similarRVSimpleAdapter
        return view
    }

    fun onSuccess(movies: List<Movie>){
        movieList=movies
        similarRVSimpleAdapter.list = movies;
        similarRVSimpleAdapter.notifyDataSetChanged();
    }
    fun onError() {
        val toast = Toast.makeText(context, "Search error", Toast.LENGTH_SHORT)
        toast.show()
    }

}