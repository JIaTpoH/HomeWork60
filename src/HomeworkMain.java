import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkMain {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author 3", "Book 3", 250));
    books.add(new Book("Author 1", "Book 2", 251));
    books.add(new Book("Author 3", "Book 1", 252));

    books.sort((b1, b2) -> {
      if (!b1.getTitle().equals(b2.getTitle())) {
        return b1.getTitle().compareTo(b2.getTitle());
      }
      return b1.getAuthor().compareTo(b2.getAuthor());
    });

    for (Book b : books) {
      System.out.println(b);
    }
  }
}