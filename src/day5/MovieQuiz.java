package day5;

import java.util.Scanner;

public class MovieQuiz {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //        while(true) {

    System.out.print("영화 제목: ");
    String title = scanner.nextLine();
    System.out.print("관람 인원 수: ");
    int num = scanner.nextInt();
    //scanner.nextLine();
    System.out.print("예매자 이름: ");
    String name = scanner.nextLine();
    System.out.print("예매자 전화번호: ");
    String phoneNumber = scanner.nextLine();

    System.out.println("===== 영화 티켓 예매 정보 =====");
    System.out.println("영화 제목 :" + title);
    System.out.println("관람 인원 : " + num + "명");
    System.out.println("예매자 이름 : " + name);
    System.out.println("예매자 전화번호 " + phoneNumber);
    System.out.println("총 결제 금액 " + num * 10000 + "원");
    //            if(scanner.nextLine().isEmpty()) break;
    //        }


  }
}
