
public class MoviesController {
    int nrOfLikes;
    Movie[] movies;

    static void likeMovies(Movie[] movies, int nrOfLikes) {
        for (int i = 0; i <= nrOfLikes; i++) {
            int min = 1;
            int max = 4;
            int range = (max - min) + 1;
            range = (int) (Math.random() * range) + min;
            movies[range].like();
        }
    }

    static void print(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            movies[i].printMovie();
        }
    }


}
