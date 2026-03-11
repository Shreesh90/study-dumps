package BookMyShow;

import BookMyShow.Enums.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityToTheatreMapping;
    List<Theatre> theatres;

    public TheatreController() {
        this.cityToTheatreMapping = new HashMap<>();
        this.theatres = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city) {
        theatres.add(theatre);

        List<Theatre> cityTheatres = cityToTheatreMapping.getOrDefault(city, new ArrayList<>());
        cityTheatres.add(theatre);
        cityToTheatreMapping.put(city, cityTheatres);
    }

    Map<Theatre, List<Show>> getAllShows(Movie movie, City city) {

    }
}
