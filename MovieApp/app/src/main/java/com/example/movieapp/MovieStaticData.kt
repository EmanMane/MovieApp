package com.example.movieapp

import android.util.Log

fun getFavoriteMovies(): List<Movie> {
    return listOf(
        Movie(1,"Avengers: Endgame",
            "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
            "16.02.2021.","https://www.imdb.com/title/tt4154796/",
            "scifi",listOf(
                "Robert Downey Jr.",
                "Chris Evans",
                "Mark Ruffalo",
                "Chris Hemsworth",
                "Scarlett Johansson",
                "Jeremy Renner",
                "Don Cheadle",
                "Paul Rudd",
                "Brie Larson",
                "Karen Gillan",
                "Danai Gurira",
                "Benedict Wong",
                "Jon Favreau",
                "Bradley Cooper",
                "Gwyneth Paltrow",
                "Josh Brolin",
                "Tom Hiddleston",
                "Idris Elba",
                "Tessa Thompson",
                "Rene Russo",
                "Elizabeth Olsen",
                "Anthony Mackie",
                "Sebastian Stan",
                "Tom Holland",
                "Pom Klementieff",
                "Dave Bautista",
                "Letitia Wright",
                "Chadwick Boseman",
                "Michael Douglas",
                "Michelle Pfeiffer",
                "Vin Diesel",
                "Linda Cardellini",
                "Frank Grillo",
                "Hiroyuki Sanada",
                "Stan Lee"
            ),listOf(
                "Avengers: Infinity War",
                "Avengers: Age of Ultron",
                "Captain America: The Winter Soldier",
                "Captain America: Civil War",
                "Thor: Ragnarok",
                "Guardians of the Galaxy",
                "Guardians of the Galaxy Vol. 2",
                "Spider-Man: Homecoming",
                "Doctor Strange",
                "Black Panther",
                "Captain Marvel"
            )),
        Movie(2,"Star Wars: The Last Jedi",
            "The Star Wars saga continues as new heroes and galactic legends go on an epic adventure, unlocking mysteries of the Force and shocking revelations of the past.",
            "16.02.2021.","https://www.imdb.com/title/tt2527336/?ref_=fn_al_tt_1",
            "scifi",listOf(
                "Daisy Ridley",
                "Adam Driver",
                "John Boyega",
                "Oscar Isaac",
                "Mark Hamill",
                "Carrie Fisher",
                "Domhnall Gleeson",
                "Laura Dern",
                "Andy Serkis",
                "Benicio Del Toro",
                "Gwendoline Christie",
                "Anthony Daniels",
                "Kelly Marie Tran",
                "Frank Oz",
                "Joonas Suotamo"
            ), listOf(
                "Star Wars: The Force Awakens",
                "Rogue One: A Star Wars Story",
                "Star Wars: Episode IX - The Rise of Skywalker",
                "Star Wars: Episode I - The Phantom Menace",
                "Star Wars: Episode II - Attack of the Clones",
                "Star Wars: Episode III - Revenge of the Sith",
                "Star Wars: Episode IV - A New Hope",
                "Star Wars: Episode V - The Empire Strikes Back",
                "Star Wars: Episode VI - Return of the Jedi",
                "Star Wars: Episode VII - The Force Awakens",
                "Star Wars: Episode VIII - The Last Jedi",
                "Star Wars: The Clone Wars",
                "Solo: A Star Wars Story"
            )),
        Movie(3,"The Whale",
            "A reclusive, morbidly obese English teacher attempts to reconnect with his estranged teenage daughter.",
            "16.02.2021.","https://www.imdb.com/title/tt13833688/?ref_=adv_li_tt",
            "drama",listOf("Brendan Fraser", "Elsa Pataky", "Julia Rehwald"), listOf("Free Willy", "Dolphin Tale", "Blackfish")),
        Movie(4,"Smile",
            "After witnessing a bizarre, traumatic incident involving a patient, a psychiatrist becomes increasingly convinced she is being threatened by an uncanny entity.",
            "16.02.2021.","https://www.imdb.com/title/tt15474916/?ref_=fn_al_tt_1",
            "horror", listOf("Nathan Stewart-Jarrett", "Sophie Kennedy Clark", "Gbemisola Ikumelo"), listOf("Little Miss Sunshine", "Juno", "Eternal Sunshine of the Spotless Mind")),
        Movie(5,"Interstellar",
            "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            "16.02.2021.","https://www.imdb.com/title/tt0816692/",
            "scifi",listOf("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"), listOf("Gravity", "The Martian", "Inception")),
        Movie(6,"The Godfather",
            "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            "16.02.2021.","https://www.imdb.com/title/tt0068646/",
            "drama",listOf("Marlon Brando", "Al Pacino", "James Caan"), listOf("The Godfather: Part II", "Goodfellas", "The Departed")),
        Movie(7,"Get Out",
            "A young African-American visits his white girlfriend's parents for the weekend, where his simmering uneasiness about their reception of him eventually reaches a boiling point.",
            "16.02.2021.","https://www.imdb.com/title/tt5052448/",
            "horror",listOf("Daniel Kaluuya", "Allison Williams", "Bradley Whitford"), listOf("Us", "Hereditary", "The Babadook")),
        Movie(8,"The Lord of the Rings: The Fellowship of the Ring",
            "A meek hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.",
            "16.02.2021.","https://www.imdb.com/title/tt0120737/",
            "fantasy",listOf("Elijah Wood", "Ian McKellen", "Orlando Bloom"), listOf("The Lord of the Rings: The Two Towers", "The Lord of the Rings: The Return of the King", "The Hobbit: An Unexpected Journey")),
        Movie(9, "Jurassic Park",
            "A pragmatic paleontologist visiting an almost complete theme park is tasked with protecting a couple of kids after a power failure causes the park's cloned dinosaurs to run loose.",
            "16.02.2021", "https://www.imdb.com/title/tt0107290/",
            "adventure", listOf("Sam Neill", "Laura Dern", "Jeff Goldblum"), listOf("Jurassic World", "King Kong", "Avatar")),
        Movie(10, "The Matrix",
            "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
            "16.02.2021", "https://www.imdb.com/title/tt0133093/",
            "scifi", listOf("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"), listOf("Inception", "Blade Runner", "The Terminator")),
        Movie(11, "The Silence of the Lambs",
            "A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims.",
            "16.02.2021", "https://www.imdb.com/title/tt0102926/",
            "drama", listOf("Jodie Foster", "Anthony Hopkins", "Scott Glenn"), listOf("Se7en", "Fight Club", "Memento")),
        Movie(12, "Goodfellas",
            "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.",
            "16.02.2021", "https://www.imdb.com/title/tt0099685/",
            "drama", listOf("Robert De Niro", "Ray Liotta", "Joe Pesci"), listOf("The Godfather", "The Departed", "Scarface")),
        Movie(13, "The Lion King",
            "A lion prince flees his kingdom only to learn the true meaning of responsibility and bravery.",
            "16.02.2021", "https://www.imdb.com/title/tt0110357/",
            "adventure", listOf("Matthew Broderick", "Jeremy Irons", "James Earl Jones"), listOf("Beauty and the Beast", "Aladdin", "Mulan")),
        Movie(14, "The Social Network",
            "The story of Mark Zuckerberg, a computer programmer and entrepreneur, who co-founded Facebook, and became the youngest billionaire in history.",
            "16.02.2021", "https://www.imdb.com/title/tt1285016/",
            "drama", listOf("Jesse Eisenberg", "Andrew Garfield", "Justin Timberlake"), listOf("Steve Jobs", "The Imitation Game", "The Founder")),

        Movie(15, "Inception",
            "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.",
            "16.02.2021", "https://www.imdb.com/title/tt1375666/",
            "drama", listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page"), listOf("Interstellar", "The Prestige", "The Dark Knight")),

        Movie(16, "The Shawshank Redemption",
            "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.",
            "16.02.2021", "https://www.imdb.com/title/tt0111161/",
            "drama", listOf("Tim Robbins", "Morgan Freeman", "Bob Gunton"),listOf("The Green Mile", "Forrest Gump", "Schindler's List")),

    )
}
fun getRecentMovies(): List<Movie> {
    return listOf(
        Movie(1,"The Dictator",
            "The heroic story of a dictator who risked his life to ensure that democracy would never come to the country he so lovingly oppressed.",
            "16.02.2021.","https://www.imdb.com/title/tt1645170/?ref_=fn_al_tt_1",
            "comedy",listOf("Sacha Baron Cohen", "Anna Faris", "Ben Kingsley"), listOf("Borat", "Brüno", "The Interview")),

        Movie(2,"Shrek",
            "A mean lord exiles fairytale creatures to the swamp of a grumpy ogre, who must go on a quest and rescue a princess for the lord in order to get his land back.",
            "16.02.2021.","https://www.imdb.com/title/tt0126029/?ref_=nv_sr_srsg_0",
            "fantasy", listOf("Mike Myers", "Eddie Murphy", "Cameron Diaz"), listOf("Toy Story", "The Lion King", "Finding Nemo")),

        Movie(3,"Back to the Future Part III",
            "Stranded in 1955, Marty McFly learns about the death of Doc Brown in 1885 and must travel back in time to save him. With no fuel readily available for the DeLorean, the two must figure how to escape the Old West before Emmett is murdered.",
            "16.02.2021.","https://www.imdb.com/title/tt0099088/?ref_=fn_al_tt_3",
            "western", listOf("Michael J. Fox", "Christopher Lloyd", "Mary Steenburgen"), listOf("The Good, the Bad and the Ugly", "Unforgiven", "Once Upon a Time in the West")),

        Movie(4,"Puss in Boots: The Last Wish",
            "When Puss in Boots discovers that his passion for adventure has taken its toll and he has burned through eight of his nine lives, he launches an epic journey to restore them by finding the mythical Last Wish.",
            "16.02.2021.","https://www.imdb.com/title/tt3915174/?ref_=nv_sr_srsg_2",
            "adventure", listOf("Antonio Banderas", "Salma Hayek", "Zach Galifianakis"), listOf("The Adventures of Tintin", "How to Train Your Dragon", "Kung Fu Panda"))
    )
}

fun getActorsByMovieTitle(title: String): List<String> {
    //Log.d("EMANEEEE", "getActorsByMovieTitle called with movieTitle: $title")
    val recent = getRecentMovies()
    val favorite = getFavoriteMovies()
    val movies = recent + favorite
    val movie = movies.find { it.title == title }
    return movie?.actors ?: emptyList()
}

fun getSimilarByMovieTitle(title: String): List<String> {
    val recent = getRecentMovies()
    val favorite = getFavoriteMovies()
    val movies = recent + favorite
    val movie = movies.find { it.title == title }
    return movie?.similar ?: emptyList()
}
