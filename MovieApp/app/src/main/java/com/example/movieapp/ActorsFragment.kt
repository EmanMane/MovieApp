package com.example.movieapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActorsFragment : Fragment() {
    private lateinit var actors: RecyclerView
    private lateinit var actorsAdapter: StringListAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_actors, container, false)
        actors = view.findViewById(R.id.actors)
        actors.layoutManager = GridLayoutManager(activity, 1)

        //Retrieving the movie title from parent activity of fragments
        val activity: MovieDetailActivity? = activity as MovieDetailActivity?
        val titleFromActivity: String? = activity?.getMovieTitle()
        actorsAdapter = titleFromActivity?.let { getSimilarByMovieTitle(it) }
            ?.let { StringListAdapter(it) }!!

        actorsAdapter = StringListAdapter(getActorsByMovieTitle(titleFromActivity))
        actors.adapter = actorsAdapter
        return view
    }
}
