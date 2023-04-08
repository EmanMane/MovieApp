package com.example.movieapp


import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.hasProperty
import org.hamcrest.core.Is
import org.junit.Assert.*
import org.junit.Test

public class UnitTests {
    @Test
    fun testGetFavoriteMovies(){
        val movies = getFavoriteMovies()
        assertEquals(movies.size,4)
        assertThat(movies, hasItem<Movie>(hasProperty("title", Is(equalTo("The Whale")))))
        assertThat(movies, not(hasItem<Movie>(hasProperty("title", `is`("Black Widow")))))
    }

}