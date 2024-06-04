package daily_quiz;

public class Quiz_06_04 {

  public static void main(String[] args) {

    gugudan();

  }

  static void count() {

    int count = 1;

    while (true) {
      count++;
      if (count > 10000)
        break;
      System.out.println(count);
    }
  }

  static void gugudan() {

    for(int i = 9; i > 0; i--) {
      for(int j = 1; j < 10; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
    }
  }


}
