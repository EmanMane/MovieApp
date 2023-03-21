package com.example.movieapp

fun getFavoriteMovies(): List<Movie> {
    return listOf(
        Movie(1,"Avengers: Endgame",
            "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            "16.02.2021.","https://www.imdb.com/title/tt4154796/",
            "scifi"),
        Movie(2,"Star Wars: The Last Jedi",
            "The Star Wars saga continues as new heroes and galactic legends go on an epic adventure, unlocking mysteries of the Force and shocking revelations of the past.",
            "16.02.2021.","https://www.imdb.com/title/tt0414387/",
            "scifi"),
        Movie(3,"The Whale",
            "A reclusive, morbidly obese English teacher attempts to reconnect with his estranged teenage daughter.",
            "16.02.2021.","https://www.imdb.com/title/tt13833688/?ref_=adv_li_tt",
            "drama"),
        Movie(4,"Smile",
            "After witnessing a bizarre, traumatic incident involving a patient, a psychiatrist becomes increasingly convinced she is being threatened by an uncanny entity.",
            "16.02.2021.","https://www.imdb.com/title/tt15474916/?ref_=fn_al_tt_1",
            "horror"),
    )
}
fun getRecentMovies(): List<Movie> {
    return listOf(
        Movie(1,"The Dictator",
            "The heroic story of a dictator who risked his life to ensure that democracy would never come to the country he so lovingly oppressed.",
            "16.02.2021.","https://www.imdb.com/title/tt1645170/?ref_=fn_al_tt_1",
            "comedy"),
        Movie(2,"Shrek",
            "A mean lord exiles fairytale creatures to the swamp of a grumpy ogre, who must go on a quest and rescue a princess for the lord in order to get his land back.",
            "16.02.2021.","https://www.imdb.com/title/tt0126029/?ref_=nv_sr_srsg_0",
            "fantasy"),
        Movie(3,"Back to the Future Part III",
            "Stranded in 1955, Marty McFly learns about the death of Doc Brown in 1885 and must travel back in time to save him. With no fuel readily available for the DeLorean, the two must figure how to escape the Old West before Emmett is murdered.",
            "16.02.2021.","https://www.imdb.com/title/tt0099088/?ref_=fn_al_tt_3",
            "western"),
        Movie(4,"Puss in Boots: The Last Wish",
            "When Puss in Boots discovers that his passion for adventure has taken its toll and he has burned through eight of his nine lives, he launches an epic journey to restore them by finding the mythical Last Wish.",
            "16.02.2021.","https://www.imdb.com/title/tt3915174/?ref_=nv_sr_srsg_2",
            "adventure"),
    )
}