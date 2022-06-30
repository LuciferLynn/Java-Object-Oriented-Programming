package _Exercise2;

public class testBook {

    public static void main(String[] args) {
        // Construct an author instance
        Author jkRowling = new Author("JK.Rowling", "rowling@gmail.com", 'm');
        System.out.println(jkRowling);  // Author's toString()

        Book dummyBook = new Book("Jerry Porter", jkRowling, 69.99, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.99);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book failure = new Book("Failure",
                new Author("LynnThitKekw","lnyinyi22@gmail.com",'m'), 12.00, 20);
        System.out.println(failure);
    }

}
