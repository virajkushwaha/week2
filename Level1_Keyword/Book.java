

public class Book {
    //initializing every variable according to use 
    static String libraryName = "XYZ";
    String title;
    String author ; final String ISBN ;

    Book(String title , String author , String isbn){
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
    }

    static void displayLibraryName(){
        System.out.println("Library Name: "+ libraryName);
    }

    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }



}
