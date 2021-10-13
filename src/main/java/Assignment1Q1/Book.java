package Assignment1Q1;

public class Book extends Publication{
    String bookName;

    Book(String bookName,int noOfPages, int price, String publisherName){
        this.bookName = bookName;
        this.noOfPages = noOfPages;
        this.price = price;
        this.publisherName = publisherName;
    }
}
