package com.example.movieapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class SearchFragment : Fragment() {
    private lateinit var searchText: EditText
    private lateinit var searchMovies: RecyclerView
    private lateinit var searchButton: ImageButton
    val scope = CoroutineScope(Job() + Dispatchers.Main)
    private var searchMoviesAdapter: SearchMoviesAdapter = SearchMoviesAdapter(arrayListOf())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_search, container, false)
        searchText = view.findViewById(R.id.searchText)
        arguments?.getString("search")?.let {
            searchText.setText(it)
        }
        searchText.doOnTextChanged { _, _, _, _ ->
            onClick()
        }

        searchText.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (!hasFocus) {
                val imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(v.windowToken, 0)
            }
        }

        searchMovies = view.findViewById(R.id.searchRecycler)
        searchMovies.layoutManager = GridLayoutManager(activity, 2)
        searchMovies.adapter = searchMoviesAdapter

        searchMovies.setOnTouchListener { _, _ ->
            val imm = requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(searchText.windowToken, 0)
            false
        }

        searchButton = view.findViewById(R.id.searchButton)
        searchButton.setOnClickListener{ onClick() }
        return view

    }
    //On Click handler
    private fun onClick() {
        //val toast = Toast.makeText(context, "Search start", Toast.LENGTH_SHORT)
        //toast.show()
        search(searchText.text.toString())
    }
    fun search(query: String){
        val scope = CoroutineScope(Job() + Dispatchers.Main)
        // Kreira se Coroutine na UI
        scope.launch{
            // Vrti se poziv servisa i suspendira se rutina dok se `withContext` ne zavrsi
            val result = MovieRepository.searchRequest(query)
            // Prikaze se rezultat korisniku na glavnoj niti
            when (result) {
                is Result.Success<List<Movie>> -> searchDone(result.data)
                else-> onError()
            }
        }
    }
    fun searchDone(movies:List<Movie>){
        //val toast = Toast.makeText(context, "Search done", Toast.LENGTH_SHORT)
        //toast.show()
        searchMoviesAdapter.updateMovies(movies)
    }
    fun onError() {
        val toast = Toast.makeText(context, "Search error", Toast.LENGTH_SHORT)
        toast.show()
    }

}