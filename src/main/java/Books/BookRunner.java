package Books;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book("5 States","Chetan Bhagat");
        System.out.println(book1);
        book1.addreview("This book is awesome must read", (float) 8.6);
        book1.addreview("This is second review", (float) 9.6);
        System.out.println(book1);
        book1.addreview("This is Third review", (float) 5);
        System.out.println(book1);
    }
}
