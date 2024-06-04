package day4;

public class Gugudan {

  public static void main(String[] args) {

    for (int i = 19; i > 0; i--) {
      for(int j = 19; j > 0; j--) {
        System.out.printf("%3d ", i * j);
      }
      System.out.println();
    }
  }
}
