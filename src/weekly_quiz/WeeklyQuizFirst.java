package weekly_quiz;

import java.util.Scanner;

public class WeeklyQuizFirst {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.println("\n원하는 기능을 선택하세요");
      System.out.println("1. 덧셈 / 2. 뺄셈 / 3. 곱셈 / 4. 나눗셈 / 0. 종료");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          {
            System.out.print("첫번째 값을 입력하고 엔터를 누르세요 : ");
            int firstNum = sc.nextInt();
            System.out.print("두번째 값을 입력하고 엔터를 누르세요 : ");
            int secondNum = sc.nextInt();
            System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
            break;
          }

        case 2:
          {
            System.out.print("첫번째 값을 입력하고 엔터를 누르세요 : ");
            int firstNum = sc.nextInt();
            System.out.print("두번째 값을 입력하고 엔터를 누르세요 : ");
            int secondNum = sc.nextInt();
            System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
            break;
          }

        case 3:
          {
            System.out.print("첫번째 값을 입력하고 엔터를 누르세요 : ");
            int firstNum = sc.nextInt();
            System.out.print("두번째 값을 입력하고 엔터를 누르세요 : ");
            int secondNum = sc.nextInt();
            System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
            break;
          }

        case 4:
          {
            System.out.print("첫번째 값을 입력하고 엔터를 누르세요 : ");
            double firstNum = sc.nextInt();
            System.out.print("두번째 값을 입력하고 엔터를 누르세요 : ");
            double secondNum = sc.nextInt();
            System.out.println(
                firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
            break;
          }

        case 0:
          {
            System.out.println("종료합니다.");
            sc.close();
            return;
          }

        default:
          {
            System.out.println("올바른 입력이 아닙니다.");
            break;
          }
      }
    }
  }
}
