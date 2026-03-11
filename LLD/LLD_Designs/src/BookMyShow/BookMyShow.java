package BookMyShow;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialise();
    }

    public void initialise() {

    }

    public void createMovie() {
        Movie avengers = new Movie(1, "avengers");
        Movie threeIdiots = new Movie(2, "three_idiots");

        movieController.addMovie(avengers);
        movieController.addMovie(threeIdiots);
    }

    public void createTheatre() {
        Theatre pune = new Theatre();
    }
}
