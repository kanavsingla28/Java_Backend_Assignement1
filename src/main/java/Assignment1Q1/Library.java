package Assignment1Q1;

import java.util.ArrayList;

public class Library {
    ArrayList<Publication> library = new ArrayList<>();
    String addBookToLibrary(String bookName,int noOfPages, int price, String publisherName){
        Publication newBook = new Book(bookName,noOfPages, price, publisherName);
        library.add(newBook);
        return "Book added to Library";
    }
    String addJournal(String journalName,int noOfPages, int price, String publisherName){
        Publication newJournal= new Journal(journalName,noOfPages, price, publisherName);
        library.add(newJournal);
        return "Journal added to library";
    }
}
