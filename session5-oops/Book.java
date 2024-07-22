class Book {

    // instance variables
    String title;
    String author;
    int pages;

    // constructor overloading
    // default constructor is explicitly defined: without parameters
    Book() {
        System.out.println("constructor is called");
    }

    // parameterized constructor: with parameters
    Book(String title, String author, int pages) {
        // title, author, pages are local variables -> parameters
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // method
    // Price is calculated based on the number of pages
    // 1 page = 3.5 rupees
    double getPrice() {
        return this.pages * 3.5;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rowling", 500);

        System.out.println(book1.title + " " + book1.author + " " + book1.pages);
        System.out.println(book1.getPrice() + " rupees");
    }
}
