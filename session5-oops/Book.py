class Book:
    # default constructor is explicitly defined
    # python does not support constructor overloading

    # default constructor
    def __init__(self, *args):
        if len(args) == 3:
            # parametrized constructor
            self.title = args[0]
            self.author = args[1]
            self.pages = args[2]
        else:
            # default constructor
            self.title = ""
            self.author = ""
            self.pages = 0


# book1 = Book("Harry Potter", "JK Rowling", 500)
book1 = Book()

print(book1.title, book1.author, book1.pages)
