package day1;

public class Main {

  /**
   * @author 굿
   * @apiNote 이것은 무엇을 하는거냐?
   */
  public static void main(String[] args) {

    String s1 = new String("String");
    String s2 = new String("String");
    String s3 = "Strings";
    String s4 = "Strings";

    // hashcode() : 문자열 내용 기준으로 해시코드 생성
    // System.identityHashCode() : 문자열의 실제 주소 기준으로 해시코드 생성
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s4));
    System.out.println(s1 == s2);
    System.out.println(s3 == s4);

    int[] arr1 = {1, 2, 3};
    int[] arr2 = arr1;  // arr2는 arr1과 동일한 배열을 참조
    arr1[0] = 10;  // arr1의 첫 번째 요소 변경, arr2도 변경된 값 반영

    System.out.println(arr2[0]);

    //    int a1 = 1;
    //    int a2 = a1;
    //
    //    System.out.println(s1.equals(s2));
    //    System.out.println(a1 == a2);
  }
}
