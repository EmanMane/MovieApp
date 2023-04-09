package com.example.movieapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SimilarFragment : Fragment() {
    private lateinit var similar: RecyclerView
    private lateinit var similarAdapter: StringListAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_similar, container, false)
        similar = view.findViewById(R.id.similar)
        similar.layoutManager = GridLayoutManager(activity, 1)

        //Retrieving the movie title from parent activity of fragments
        val activity: MovieDetailActivity? = activity as MovieDetailActivity?
        val titleFromActivity: String? = activity?.getMovieTitle()
        similarAdapter = titleFromActivity?.let { getSimilarByMovieTitle(it) }
            ?.let { StringListAdapter(it) }!!

        similarAdapter = StringListAdapter(getSimilarByMovieTitle(titleFromActivity))
        similar.adapter = similarAdapter
        return view
    }
}