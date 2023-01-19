package inheritance;

public class Review {
    String reviewBody;
    String author;
    Int StarsScore;

    public Review(){
    }

    public Review(String reviewBody, String author, Int starsScore){
        this.reviewBody = reviewBody;
        this.author = author;
        setStarsScore(starsScore);
    }
    public void setStarsScore(Int starsScore){

        this.starsScore = starsScore;
    }

    public Int getStars(){
        return starsScore;
    }

    public void updateStarsScore(Int starsScore){
        if(starsScore < 0 )
            throw new Exception("Star score cannot be negative");
            if(starsScore > 5)
                throw new Exception("Star score cannot exceed 5");
            setStarsScore(starsScore);
    }


    public String getAuthor(){
        return author;
    }

}
