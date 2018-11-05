public class Movie {
    public String name;
    public int rating;

    public Movie(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    void like(){ rating = rating + 1;}

    void printMovie(){ System.out.println("The name: " + name + ", rating: " + rating + ";");}

}
