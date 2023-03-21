package com.example.movieapp

import android.app.UiModeManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import android.content.res.Configuration
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    private lateinit var searchText: EditText
    private lateinit var favoriteMovies: RecyclerView
    private lateinit var favoriteMoviesAdapter: MovieListAdapter
    private var favoriteMoviesList =  getFavoriteMovies()

    private lateinit var recentMovies: RecyclerView
    private lateinit var recentMoviesAdapter: MovieListAdapter
    private var recentMoviesList =  getRecentMovies()

    private var isBosnian: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        favoriteMovies = findViewById(R.id.favoriteMovies)
        favoriteMovies.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        favoriteMoviesAdapter = MovieListAdapter(arrayListOf()) { movie -> showMovieDetails(movie) }
        favoriteMovies.adapter = favoriteMoviesAdapter
        favoriteMoviesAdapter.updateMovies(favoriteMoviesList)

        recentMovies = findViewById(R.id.recentMovies)
        recentMovies.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        recentMoviesAdapter = MovieListAdapter(arrayListOf()) { movie -> showMovieDetails(movie) }
        recentMovies.adapter = recentMoviesAdapter
        recentMoviesAdapter.updateMovies(recentMoviesList)

        if(intent?.action == Intent.ACTION_SEND && intent?.type == "text/plain")
            handleSendText(intent)

        // Find the ThemeSwitch button in the layout and set a click listener
        val switchThemeButton: Button = findViewById(R.id.themeSwitchButton)
        switchThemeButton.setOnClickListener {
            switchTheme()
        }
    }

    private fun showMovieDetails(movie: Movie) {
        val intent = Intent(this, MovieDetailActivity::class.java).apply {
            putExtra("movie_title", movie.title)
        }
        startActivity(intent)
    }

    private fun handleSendText(intent: Intent) {
        intent.getStringExtra(Intent.EXTRA_TEXT)?.let {
            searchText.setText(it)
        }
    }

    fun switchLanguage(view: View) {
        val defaultLocale = Locale.getDefault()
        val androidStudioLocale = Locale.US
        val newLocale = when (Locale.getDefault()) {
            Locale("bs", "BA") -> androidStudioLocale
            else -> Locale("bs", "BA")
        }
        Locale.setDefault(newLocale)
        val config = Configuration()
        config.locale = newLocale
        resources.updateConfiguration(config, resources.displayMetrics)
        recreate()
    }

    private fun switchTheme() {
        val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        when (currentNightMode) {
            Configuration.UI_MODE_NIGHT_NO -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            Configuration.UI_MODE_NIGHT_YES -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        recreate()
    }





}