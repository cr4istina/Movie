public class Main {
    public static void main(String[] args) {
        System.out.println("Movies!");
        Movie movie1 = new Movie("Iron Man", 0);
        Movie movie2 = new Movie("Spider Man: Homecoming", 0);
        Movie movie3 = new Movie("Avengers", 0);
        Movie movie4 = new Movie("Thor", 0);
        Movie movie5 = new Movie("Avengers: Infinity War", 0);

        Movie[] movies = {movie1, movie2, movie3, movie4, movie5};

        MoviesController.likeMovies(movies, 9);
        MoviesController.print(movies);

    }
}
