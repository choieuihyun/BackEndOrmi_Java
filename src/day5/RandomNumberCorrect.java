package day5;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberCorrect {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;

    while (true) {

      int inputNumber = scanner.nextInt();

      if (inputNumber > randomNumber) {
        System.out.println("입력 숫자가 높습니다.");
      } else if (inputNumber < randomNumber) {
        System.out.println("입력 숫자가 낮습니다.");
      } else {
        System.out.println("정답입니다.");
        break;
      }

    }
  }
}
