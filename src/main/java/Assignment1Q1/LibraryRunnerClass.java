package Assignment1Q1;

public class LibraryRunnerClass {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        System.out.println(myLibrary.addBookToLibrary("2 States", 250, 500, "Chetan Bhagat"));
        System.out.println(myLibrary.addJournal("Oxford Open Energy", 50, 125, "Oxford"));

    }
}
