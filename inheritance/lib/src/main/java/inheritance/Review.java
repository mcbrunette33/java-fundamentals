package inheritance;
//Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
//Write a Review constructor.
//Test that your constructor is working reasonably.
//Implement a reasonable toString method for Reviews.
//Write a test to create an instance of Review and ensure that its toString is working properly.
public class Review {
    public String reviewer;
    public String body;
    public int stars;



    public Review(String reviewer, String body, int stars){
        this.reviewer = reviewer;
        this.body = body;
        this.stars = stars;

    }
    @Override
    public String toString(){
        return "Reviewer: " + reviewer+ " "   + "body: " + body  +  ", Stars: " + stars;
    }

}
