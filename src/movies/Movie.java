package movies;

public class Movie {
    private String name;
    private String category;
    public static int movieCount;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
        movieCount++;
    }

    public String getMovie() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setMovie(String name, String category) {
        this.name = name;
        this.category = category;
    }
}