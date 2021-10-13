package Assignment1Q1;

public class Journal extends Publication{
    String jouralName;
    Journal(String jouralName,int noOfPages, int price, String publisherName){
        this.jouralName = jouralName;
        this.noOfPages = noOfPages;
        this.price = price;
        this.publisherName = publisherName;
    }
}
