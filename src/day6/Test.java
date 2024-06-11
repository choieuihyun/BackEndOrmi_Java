package day6;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("계좌번호를 입력해주세요 : ");
    int accountNumber = scanner.nextInt();
    scanner.nextLine();
    System.out.print("소유자 이름을 입력하세요 : ");
    String name = scanner.nextLine();

    BankAccount bankAccount = new BankAccount(accountNumber, name);

    bankAccount.deposit(100000);
    bankAccount.withdraw(50000);

    System.out.println(bankAccount.money);
  }
}
