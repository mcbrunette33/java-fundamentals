package inheritance;

public class TheaterReview extends Review {
    public String movieName;

    public TheaterReview(String reviewer, String body, int stars, String movieName) {
        super(reviewer, body, stars);
        this.movieName = movieName;
    }
    public TheaterReview(String reviewer, String body, int stars) {
        super(reviewer, body, stars);
    }
    @Override
    public String toString(){
        return "Reviewer: " + reviewer+ " "
                + "body: " + body
                +  ", Stars: " + stars
                + "Movie: " + movieName;

    }
}
