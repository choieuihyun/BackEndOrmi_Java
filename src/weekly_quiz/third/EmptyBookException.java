package weekly_quiz.third;

public class EmptyBookException extends Exception {

    public EmptyBookException() {
        super("책이 없습니다.");
    }

    public EmptyBookException(String message, Throwable t) {
        super(message, t);
    }

}
