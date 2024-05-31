package day1;

public class Test extends Galaxy {

  public static void main(String[] args) {

    boolean isTrue = false;

    if (isTrue) {
      System.out.println("이건 트루입니다");
    } else {
      System.out.println("이건 펄스입니다.");
    }

    String s = "sdfsdf";

    System.out.println(s.hashCode());
    System.out.println(System.identityHashCode(s));


  }


}
