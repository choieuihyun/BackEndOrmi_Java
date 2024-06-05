package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomTest {

  public static void main(String[] args) {

    Random random = new Random();
    ArrayList<Integer> lottoList = new ArrayList<>();
    int temp = 0;

    for (int i = 0; i < 6; i++) {

      int number = random.nextInt(45);

      if (lottoList.contains(number)) i--;
      else lottoList.add(number);

    }

    for (int i = 0; i < lottoList.size(); i++) {

      for (int j = 0; j < lottoList.size() - i - 1; j++) {

        if (lottoList.get(j) > lottoList.get(j + 1)) {
          temp = lottoList.get(j);
          lottoList.set(j, lottoList.get(j + 1));
          lottoList.set(j + 1, temp);
        }
      }
    }

    for (int i : lottoList) {
      System.out.println(i);
    }
  }
}
