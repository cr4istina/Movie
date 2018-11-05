public class MoviesController {
    public int nrOfLikes;
    public Movie[] movies;

    static void likeMovies(Movie[] movies, int nrOfLikes) {
        for (int i = 0; i < nrOfLikes; i++) {
                int min = 1;
                int max = movies.length - 1;
                int range = (max - min) + 1;
                range = (int) (Math.random() * range) + min;
                if (movies[range] != null) {
                    movies[range].like();
                }
        }
    }

    static void print(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null)
                movies[i].printMovie();
        }
    }

}
