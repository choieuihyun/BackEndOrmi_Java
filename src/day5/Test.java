package day5;

public class Test {

  public static void main(String[] args) {

    String[] words = {"apple", "banana", "cherry", "durian"};

    for (int i = 0; i < words.length; i++) {
      for (int j = i; j < words.length; j++) {
        if (!words[i].equals(words[j])) {
          System.out.println(words[i] + " " + words[j]);
        }
      }
    }
  }
}
