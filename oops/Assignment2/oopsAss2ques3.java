import java.util.ArrayList;

public class oopsAss2ques3 {
    private String title;
    private String genre;
    private String director;
    private int durationMinutes;
    private double rating;

    public oopsAss2ques3(String title, String genre, String director, int durationMinutes, double rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.durationMinutes = durationMinutes;
        this.rating = rating;
    }

    public void display() {
        System.out.println("Title: " + title + ", Genre: " + genre + ", Director: " + director +
                           ", Duration: " + durationMinutes + " mins, Rating: " + rating);
    }

    public static void main(String[] args) {
        ArrayList<oopsAss2ques3> movies = new ArrayList<>();
        movies.add(new oopsAss2ques3("Inception", "Sci-Fi", "Christopher Nolan", 148, 8.8));
        movies.add(new oopsAss2ques3("Titanic", "Romance", "James Cameron", 195, 7.8));
        movies.add(new oopsAss2ques3("Avengers", "Action", "Joss Whedon", 143, 8.0));

        for (oopsAss2ques3 movie : movies) {
            movie.display();
        }
    }
}