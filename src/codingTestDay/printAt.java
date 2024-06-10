package codingTestDay;

public class printAt {

  public static void main(String[] args) {

    System.out.println(printAt("helloworld"));
  }

  static String printAtRecur(String str) {

    if (str.length() <= 1) {
      return str;
    }

    return str.charAt(0) + "@" + printAtRecur(str.substring(1));
  }

  static String printAt(String str) {

    int i = 0;
    String result = "";

    if (str.length() == 1) {
      result += str.charAt(i);
    }

    while (i < str.length() - 1) {
      result += str.charAt(i) + "@";
      i++;
    }

    return result;
  }
}
