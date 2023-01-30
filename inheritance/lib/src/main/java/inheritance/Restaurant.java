package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private float numOfStars;
    private String price;
    private ArrayList<Review> reviews;

    public Restaurant (String name, String price){
        this.name = name;
        this.numOfStars = 0;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review){
        int sumOfReviewStars = 0;
        reviews.add(review);
        for (Review arrayReview: reviews){
            sumOfReviewStars += arrayReview.getNumOfStars();
        }
        float averageNumOfStars = (sumOfReviewStars/reviews.size());
        setNumOfStars(averageNumOfStars);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    public float getNumOfStars(){
        return numOfStars;
    }

    public void setNumOfStars(float numOfStars){
        this.numOfStars = numOfStars;
    }

    public ArrayList<Review> getReviews(){
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews){
        this.reviews = reviews;
    }

    @Override
    public String toString(){
        return"Restaurant" + name + "prices are" + price + "has a star rating of" + numOfStars;
    }
}
