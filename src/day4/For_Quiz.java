package day4;

public class For_Quiz {

  public static void main(String[] args) {

    //    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    //    int sum = 0;
    //
    //    for (int score : scores) {
    //      sum += score;
    //    }
    //    System.out.println("총합 : " + sum);
    //    System.out.println("평균 : " + sum / scores.length);
    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};

    for (String s : arr) {

      if (s.length() >= 5)
        System.out.println(s);

    }
  }
}
