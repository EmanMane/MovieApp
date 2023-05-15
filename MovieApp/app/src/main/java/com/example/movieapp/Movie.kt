package com.example.movieapp

import android.os.Parcel
import android.os.Parcelable

data class Movie(
    val id: Long,
    val title: String,
    val overview: String,
    val releaseDate: String,
    val homepage: String?,
    val genre: String?,
    val posterPath : String?,
    val actors: List<String>?,
    val similar: List<String>?
)

data class MovieP (
    var id: Long,
    var title: String,
    var overview: String,
    var releaseDate: String,
    var homepage: String?,
    var genre: String?,
    var posterPath: String,
    var backdropPath: String
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readLong(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString(),
        parcel.readString(),
        parcel.readString()!!,
        parcel.readString()!!) {
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeLong(id)
        parcel.writeString(title)
        parcel.writeString(overview)
        parcel.writeString(releaseDate)
        parcel.writeString(homepage)
        parcel.writeString(genre)
        parcel.writeString(posterPath)
        parcel.writeString(backdropPath)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<MovieP> {
        override fun createFromParcel(parcel: Parcel): MovieP {
            return MovieP(parcel)
        }
        override fun newArray(size: Int): Array<MovieP?> {
            return arrayOfNulls(size)
        }
    }
}