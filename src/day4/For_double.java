package day4;

public class For_double {

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {

      System.out.println(i);
      if (i == 50) {
        break;
      }

      for (int j = 2; j <= 100; j++) {

        System.out.println(j);
        if (j == 80) {

          break;
        }
      }
    }
  }
}
