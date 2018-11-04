public class Main {
    public static void main(String[] args) {
        System.out.println("Movies!");
        Movie movie = new Movie("Iron Man");
        Movie movie1 = new Movie("Spider Man: Homecoming");
        Movie movie2 = new Movie("Avengers");
        Movie movie3 = new Movie("Thor");
        Movie movie4 = new Movie("Avengers: Infinity War");

        Movie[] movies = {movie, movie1, movie2, movie3, movie4};

        MoviesController.likeMovies(movies, 9);
        MoviesController.print(movies);

    }
}
