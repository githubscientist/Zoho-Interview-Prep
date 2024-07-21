class Book {

    // default constructor is explicitly defined
    Book() {
        System.out.println("constructor is called");
    }

    public static void main(String[] args) {
        Book book = new Book();

        System.out.println(book);
    }
}
