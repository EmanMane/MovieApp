package com.example.cineaste.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cineaste.R
import com.example.cineaste.data.ActorMovieRepository
import com.example.cineaste.data.Cast
import com.example.cineaste.data.GetCastResponse
import com.example.cineaste.viewmodel.MovieDetailViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class ActorsFragment() : Fragment() {
    private lateinit var actorsRV:RecyclerView
    private var actorsList= listOf<Cast>()
    private lateinit var actorsRVSimpleAdapter: SimpleCastStringAdapter
    private var movieDetailViewModel =  MovieDetailViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View = inflater.inflate(R.layout.fragment_actors, container, false)
        val intent = requireActivity().intent
        val extras = intent.extras

        if (extras != null) {
            if (extras.containsKey("movie_id") && !extras.containsKey("exists") ){
                movieDetailViewModel.getActorsById(extras.getLong("movie_id"),onSuccess = ::onSuccess,onError = ::onError)
            }
            else if (extras.containsKey("movie_id") && extras.containsKey("exists") ){
                movieDetailViewModel.getActorsByIdDB(requireContext(),extras.getLong("movie_id"),onSuccess = ::onSuccess,onError = ::onError)
            }
        }

        actorsRV = view.findViewById<RecyclerView>(R.id.listActors)
        actorsRV.layoutManager = LinearLayoutManager(activity)
        actorsRVSimpleAdapter = SimpleCastStringAdapter(actorsList)
        actorsRV.adapter = actorsRVSimpleAdapter
        return view
    }
    fun onSuccess(actors:List<Cast>){
        actorsList=actors
        actorsRVSimpleAdapter.list=actors
        actorsRVSimpleAdapter.notifyDataSetChanged();
    }
    fun onError() {
        val toast = Toast.makeText(context, "Search error", Toast.LENGTH_SHORT)
        toast.show()
    }

}