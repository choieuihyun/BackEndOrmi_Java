package weekly_quiz.third;

public class Book<T> {

    private String title;
    private String author;
    private T identifier;

    public Book(String title, String author, T identifier) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public T getIdentifier() {
        return this.identifier;
    }

    //
    public String printBook() {
        return "제목: " + this.title + " 저자: " + this.author;
    }
}
