package weekly_quiz.third;

import java.util.Stack;

public class BookStack<T> {

  private Stack<Book<T>> books;

  public BookStack() {
    books = new Stack<>();
  }

  public void pushBook(Book<T> book) {
    books.push(book);
  }

  public Book<T> popBook() {
    return books.pop();
  }

  public Book<T> peekBook() {
    return books.peek();
  }

  public boolean isEmpty() {
    if (books.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
