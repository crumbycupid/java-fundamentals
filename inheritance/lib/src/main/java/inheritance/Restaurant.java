package inheritance;

public abstract class Restaurant {
    private String name;
    private Float numOfStars;
    private String price;

    public Restaurant(){

    }
    public Restaurant (String name, Float numOfStars, String price){
        this.name = name;
        this.numOfStars = numOfStars;
        this.price = price;
    System.out.println();
    }
}
