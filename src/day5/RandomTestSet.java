package day5;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomTestSet {

  public static void main(String[] args) {

    Set set = new TreeSet();
    Random random = new Random();

    while(set.size() != 6){
      int number = random.nextInt(45)+1;
      set.add(number);
    }

    System.out.println(set);
  }
}
