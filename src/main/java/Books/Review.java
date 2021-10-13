package Books;

public class Review {
    private int id = 0;
    private String description;
    private float rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    Review(int index,String description, float rating){
        this.id = index;
        this.description = description;
        this.rating = rating;
    }
    public String toString(){
        return String.format("ReviewId: %d, ReviewDescription: %s, ReviewRating: %f",id,description,rating);
    }
}
