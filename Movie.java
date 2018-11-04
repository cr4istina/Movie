public class Movie {
    String name;
    int rating;

    public Movie(){
    }

    public Movie(String name){
        this.name = name;
    }

    void like(){
        rating = rating + 1;
    }

    void printMovie(){
        System.out.println("The name: " + name + ", rating: " + rating + ";");
    }

}
