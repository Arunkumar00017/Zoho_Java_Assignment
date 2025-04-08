import java.util.ArrayList;

public class oopsAss2ques1 {
    private String title;
    private String author;
    private String isbn;
    private double price;

    public oopsAss2ques1(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Price: " + price);
    }

    public static void main(String[] args) {
        ArrayList<oopsAss2ques1> books = new ArrayList<>();
        books.add(new oopsAss2ques1("Book One", "Author A", "1111", 299.99));
        books.add(new oopsAss2ques1("Book Two", "Author B", "2222", 199.99));
        books.add(new oopsAss2ques1("Book Three", "Author C", "3333", 399.99));

        for (oopsAss2ques1 book : books) {
            book.display();
        }
    }
}