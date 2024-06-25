package weekly_quiz.third;

import java.util.List;

public interface BookManager<T> {

    void addBook(Book<T> book);

    void removeBook(Book<T> book) throws EmptyBookException;

    List<Book<T>> searchByTitle(String title);

    List<Book<T>> searchByAuthor(String author);

}
