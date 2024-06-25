package weekly_quiz.third;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {

  private ArrayList<Book<T>> books;

  public BookShelf() {
    this.books = new ArrayList<>();
  }

  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book<T> book) {
    books.remove(book);
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {

    ArrayList<Book<T>> result = new ArrayList<>();

    for (Book<T> book : books) {
      if (book.getTitle().toLowerCase().contains(title.toLowerCase()))
        result.add(book);
    }

    return result;
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {

    ArrayList<Book<T>> result = new ArrayList<>();

    for (Book<T> book : books) {
      if (book.getAuthor().toLowerCase().contains(author.toLowerCase()))
        result.add(book);
    }

    return result;
  }
}
