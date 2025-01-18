public class LibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book3 book = new Book3("123-456-789", "Java Programming", "Viraj Kushwaha");
        book.display();

        // Change the author using setter
        book.setAuthor("Updated Author");
        System.out.println("\nUpdated Author: " + book.getAuthor());

        // Create an EBook object
        EBook ebook = new EBook("987-654-321", "Advanced Java", "Kancha", 15.5);
        ebook.displayEBook();
    }
}