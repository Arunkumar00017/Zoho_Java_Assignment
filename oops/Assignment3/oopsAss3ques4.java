class Book {
    private String title, author;
    private int bookId;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

class Member {
    private int memberId;
    private String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
}

class Librarian {
    private int librarianId;
    private String name;

    public Librarian(int librarianId, String name) {
        this.librarianId = librarianId;
        this.name = name;
    }
}

class Library {
    private String name;
    private String location;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
    }
}

public class oopsAss3ques4 {
    public static void main(String[] args) {
        Library library = new Library("City Library", "Chennai");
        System.out.println("Library system created.");
    }
}