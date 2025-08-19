public class Customer {
    private String name;
    private String movieTitle;

    public Customer(String name, String movieTitle) {
        this.name = name;
        this.movieTitle = movieTitle;
    }

    public String getName() {
        return name;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-20s", name, movieTitle);
    }
}
