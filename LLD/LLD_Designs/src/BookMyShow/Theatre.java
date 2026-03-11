package BookMyShow;

import java.util.List;

public class Theatre {
    int id;
    String theatre_name;
    List<Screen> screens;
    List<Show> shows;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheatre_name() {
        return theatre_name;
    }

    public void setTheatre_name(String theatre_name) {
        this.theatre_name = theatre_name;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
