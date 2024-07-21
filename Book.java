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

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rowling", 500);

        System.out.println(book1.title + " " + book1.author + " " + book1.pages);
    }
}
