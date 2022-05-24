package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test void createRestaurant(){
        Restaurant restaurant = new Restaurant("mcdys", "money");
//        assertEquals(restaurant.getClass(), Restaurant.class);
        Review myReview = new Review("mcdys", "this is great", 5);
        restaurant.addReview(myReview);
        System.out.println(restaurant.reviewArrayList.get(0).toString());
        assertEquals("Reviewer: mcdys body: this is great, Stars: 5",restaurant.reviewArrayList.get(0).toString());
    }

    @Test
    void updateStars() {
        Restaurant restaurant = new Restaurant("mcdys", "money");
        Review myReview1 = new Review("mcdys", "this is great", 4);
        Review myReview2 = new Review("mcdys", "this is great", 2);
        restaurant.addReview(myReview1);
        restaurant.addReview(myReview2);
        assertTrue(restaurant.getStars() == 3);
    }
}
