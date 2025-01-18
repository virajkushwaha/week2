

public class Book1 {
    public static void main(String[] args) {
        // calling parameterized constructor
        BookDetails1 book1 = new BookDetails1("Let Us C", "Jaswant", 300,false);
        BookDetails1 book3 = new BookDetails1("Let Us C", "Jaswant", 4560,true);
        BookDetails1 book4 = new BookDetails1("Harry Potter", "JK Rollin", 4560,true);
        // calling copy constructor
        BookDetails1 book2 = new BookDetails1(book1);

        BookDetails1 book6 = new BookDetails1();
        // calling default constructor
        BookDetails1 book5 = new BookDetails1();
        
        // displaying book details by calling all the constructors
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();
        book6.display();
        
        book1.borrow();
        book2.borrow();
        
    }
}
