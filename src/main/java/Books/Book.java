package Books;
import java.util.ArrayList;
public class Book{
    private int id = 0;
    private String name;
    private String author;
    private ArrayList<Review> reviewList = new ArrayList<>();

    public void addreview(String description, float rating){
        Review newReview = new Review(reviewList.size(),description,rating);
        reviewList.add(newReview);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public Book(String name, String author){
        this.id = this.id++;
        this.name = name;
        this.author = author;
    }
    public String toString(){
        return String.format("BookId: %d, BookName: %s, BookAuthor: %s, Reviews: [%s]",id,name,author,combineReviews());
    }
    public String combineReviews(){
        if(reviewList==null) return null;
        String result = "";
        for(int i=0; i<reviewList.size(); i++){
            result  += "{"+reviewList.get(i)+ "}";
            if(i<reviewList.size()-1) result+=",";
        }
        return result;
    }
}
