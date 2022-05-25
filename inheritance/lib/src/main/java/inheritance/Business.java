package inheritance;

import java.util.ArrayList;

public class Business {
    String name;

    int price;
    private int stars;
    ArrayList<Review> reviewsArrayList = new ArrayList<>();

//    public Business (String name, int price){
//        this.name = name;
//        this.price = price;
//    }
    public void addReview(Review review){
        reviewsArrayList.add(review);
        updateStars(review.stars);
    }
    public void updateStars(int reviewStars){
        if(stars == 0) {
            stars = reviewStars;
        }
        else{
            int sum = 0;
            for(Review tempReview : reviewsArrayList){
                sum += tempReview.stars;
            }
            stars = sum/reviewsArrayList.size();
        }
    }
//    @Override
//    public String toString(){
//        String response = name + " " + price + " " + stars;
//        return response;
//    }
    public int getStars() {
        return stars;
    }
}

