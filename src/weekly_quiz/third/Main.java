package weekly_quiz.third;

import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws EmptyBookException {

    BookShelf<String> bookShelf = new BookShelf<>();
    BookStack<Integer> bookStack = new BookStack<>();

    Scanner scanner = new Scanner(System.in);

    // BookShelf의 remove에 파라미터로 전달하기 위한 초기화
    Book<String> book = null;
    // books가 파라미터로 사용될 경우 전달하기 위한 초기화
    Book<Integer> books = null;

    while (true) {

      System.out.println("add / search / peek / pop / isEmpty");
      String choice = scanner.nextLine();

      switch (choice) {
        case "add":
          {
            System.out.println("제목, 저자, 식별자(정수)를 입력하세요");

            String title = scanner.nextLine();
            String author = scanner.nextLine();
            int isbn = scanner.nextInt(); // 식별자
            scanner.nextLine();

            book = new Book<>(title, author, String.valueOf(isbn));
            books = new Book<>(title, author, isbn);

            bookShelf.addBook(book);
            bookStack.pushBook(books);

            break;
          }

        case "search":
          {
            System.out.println("제목 / 저자 중 하나를 고르세요.");
            String search = scanner.nextLine();

            if (search.equals("제목")) {
              System.out.print("제목 입력 : ");
              String title = scanner.nextLine();

              // 검색하는 제목이 포함된 책 전부 출력
              List<Book<String>> titleSearchResult = bookShelf.searchByTitle(title);
              for (Book<String> b : titleSearchResult) {
                System.out.println(b.printBook() + "\n");
              }
            }

            if (search.equals("저자")) {
              System.out.print("저자 입력 : ");
              String author = scanner.nextLine();

              // 검색하는 저자가 포함된 책 전부 출력
              List<Book<String>> authorSearchResult = bookShelf.searchByAuthor(author);
              for (Book<String> b : authorSearchResult) {
                System.out.println(b.printBook());
              }
            }
            break;
          }

        case "peek":
        {
            if (!bookStack.isEmpty()) {
              System.out.println(
                  "제목: "
                      + bookStack.peekBook().getTitle()
                      + " 저자: "
                      + bookStack.peekBook().getAuthor()
                      + "\n");
          } else {
              System.out.println("책이 없습니다." + "\n");
            }
          break;
        }
        case "pop":
        {
          bookShelf.removeBook(book);
            if (!bookStack.isEmpty())
              System.out.println(bookStack.popBook().getTitle() + " 를 제거했습니다." + "\n");
            else
              System.out.println("책이 없습니다." + "\n");
          break;
        }

        case "isEmpty":
        {
          if (bookStack.isEmpty())
            System.out.println("스택이 비었습니다." + "\n");
          else
            System.out.println("스택에 책이 있습니다." + "\n");
          break;
        }

        default:
          System.out.println("제대로 된 값을 입력해주세요." + "\n");
      }
    }
  }
}
