package cl.jpinodev.favsmoviesrecyclerview.entities

data class Movie(
    val id: String,
    val title: String,
    val year: Int,
    val director: String,
    val rating: Double,
    val genre: String
){
    companion object{
        val dataMovies = mutableListOf(
            Movie("1", "Pulp Fiction", 1994, "Quentin Tarantino", 4.4, "Crime"),
            Movie("2", "The Godfather", 1972, "Francis Ford Coppola", 4.2, "Crime"),
            Movie("3", "The Dark Knight", 2008, "Christopher Nolan", 4.0, "Action"),
            Movie("4", "Full metal jacket", 1987, "Stanley Kubrick", 4.3, "War"),
            Movie("5", "The Matrix", 1999, "Lana Wachowski", 3.7, "Action"),
            Movie("6", "The Lord of the Rings: The Return of the King", 2003, "Peter Jackson", 4.9, "Adventure"),
            Movie("7", "Dune", 2021, "Denis Villeneuve", 4.1, "Science Fiction"),
            Movie("8", "Megamind", 2010, "Tom McGrath", 3.8, "Animation"),
            Movie("9", "The Silence of the Lambs", 1991, "Jonathan Demme", 3.6, "Crime"),
            Movie("10", "The Sixth Sense", 1999, "M. Night Shyamalan", 3.1, "Drama")
        )

        val dataEmpty = mutableListOf<Movie>()
    }
}
