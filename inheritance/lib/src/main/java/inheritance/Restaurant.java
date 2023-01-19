package inheritance;

public abstract class Restaurant {
    private String name;
    private Float numOfStars;
    private String price;
    private ArrayList<Review> reviews;

    public Restaurant(){

    }

    public Restaurant (String name, Float numOfStars, String price){
        this.name = name;
        this.numOfStars = numOfStars;
        this.price = price;
        this.reviews = new ArrayList<>();
    }
    public void addReview(Review review){
        int sumOfReviewStars = 0;
        reviews.add(review);
        for (Review arrayReview: reviews){
            sumOfReviewStars += arrayReview.getNumOfStars();
        }
        float averageNumOfStars = sumOfReviewStars/reviews.size();
        setNumOfStars(averageNumOfStars);
    }
}
