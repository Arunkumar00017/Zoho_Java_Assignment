public class oopsAss1ques4 {
    private String title;
    private String genre;
    private String director;
    private int durationMinutes;
    private double rating;

    public oopsAss1ques4(String title, String genre, String director, int durationMinutes, double rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.durationMinutes = durationMinutes;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}