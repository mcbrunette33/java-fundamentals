package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test void createRestaurant(){
        Restaurant restaurant = new Restaurant("mcdys", 5);
//        assertEquals(restaurant.getClass(), Restaurant.class);
        Review myReview = new Review("mcdys", "this is great", 5);
        restaurant.addReview(myReview);
        System.out.println(restaurant.reviewsArrayList.get(0).toString());
        assertEquals("Reviewer: mcdys body: this is great, Stars: 5",restaurant.reviewsArrayList.get(0).toString());
    }

    @Test
    void updateStars() {
        Restaurant restaurant = new Restaurant("mcdys", 123);
        Review myReview1 = new Review("mcdys", "this is great", 4);
        Review myReview2 = new Review("mcdys", "this is great", 2);
        restaurant.addReview(myReview1);
        restaurant.addReview(myReview2);
        assertTrue(restaurant.getStars() == 3);
    }
    @Test void updateShopCart(){
        Shop shop = new Shop("bellagio", 50);
        Review myReview3 = new Review("josh", "this is great place for cars",5);
        shop.addReview(myReview3);
    }

    @Test void MovieCreator(){
        Theater AMC = new Theater("regal", 4);
        AMC.addMovie("get rich or die trying");
        AMC.addMovie("8 mile");
        AMC.removeMovie("8 mile");
        Review myReview4 = new Review("regal", "good", 5);
        AMC.addReview(myReview4);
        System.out.println(AMC.toString());
    }
    @Test void newMovieCreation(){
        TheaterReview TheaterReview = new TheaterReview("Roger", "this is boring",5, "WetWilly");
        Review myReview5 = new Review("Roger", "this is boring",5);
        System.out.println(myReview5);
        System.out.println(TheaterReview);
    }
}
