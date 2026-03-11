package BookMyShow;

import BookMyShow.Enums.City;

import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>> cityToMovieMapping;
    List<Movie> movies;

    // CRUD operations

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }
}
