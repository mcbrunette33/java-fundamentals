package inheritance;

import java.util.ArrayList;

//Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars between 0 and 5, and a price category (i.e. number of dollar signs).
//Implement a Restaurant constructor.
//Test that your Restaurant constructor is behaving reasonably.
//Implement a reasonable toString method for Restaurants.
//Write a test to create an instance of Restaurant and ensure that its toString is working properly.
public class Restaurant extends Business {

//
//    public ArrayList<Review> reviewArrayList = new ArrayList<>();

    public Restaurant(String name, int price) {
        super.name = name;
        super.price = price;
    }
//    public Restaurant(){
//
//    }
//    public void addReview(Review input){
//        reviewArrayList.add(input);
//        updateStars(input.stars);
//    }
//    public void updateStars(int reviewStars){
//       if(stars == 0) {
//           stars = reviewStars;
//       }
//       else{
//           int sum = 0;
//           for(Review tempReview : reviewArrayList){
//               sum += tempReview.stars;
//           }
//           stars = sum/reviewArrayList.size();
//       }
//    }
        @Override
        public String toString () {
            String response = name + " " + price + " " + getStars();
            return response;
        }

//    public int getStars() {
//        return stars;
//    }
}
