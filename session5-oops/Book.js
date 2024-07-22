class Book {
    // javascript does not support constructor overloading
    constructor() {
        if (arguments.length === 3) {
            // parameterized constructor
            this.title = arguments[0];
            this.author = arguments[1];
            this.pages = arguments[2];
        } else {
            // default constructor
            this.title = "No Title";
            this.author = "No Author";
            this.pages = 0;
        }
    }
}

// let book = new Book("Harry Potter", "J.K. Rowling", 500)
let book = new Book();

console.log(book);