package inheritance;

public class Review {
    String reviewBody;
    String author;
    Float stars;

    public Review(){
    }

    public Review(String reviewBody, String author, Float stars){
        this.reviewBody = reviewBody;
        this.author = author;
        setStars(stars);
    }
    public void setStars(Float stars){
        this.stars = stars;
    }

    public Float getStars(){
        return stars;
    }

    public void updateStars(Float stars){

    }
    public String getAuthor(){
        return author;
    }
}
