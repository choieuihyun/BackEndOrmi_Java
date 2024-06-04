package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Test {

  public static void main(String[] args) {
    //    int i = 1;
    //    int sum = 0;
    //    while (i <= 100) {
    //      sum += i;
    //      i++;
    //    }
    //    System.out.println(sum);

//        int [] numbers = {5,2,9,1,7,4,6,3,8};
//        int i = 0;
//        int sum = 0;
//        while(i < numbers.length) {
//          sum += numbers[i];
//          i++;
//        }
//        System.out.println(sum / numbers.length);

    //    int i = 1;
    //    while (i <= 300) {
    //      if(i % 3 == 0) System.out.println(i);
    //      i++;
    //    }

    //    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    //    int i = 0;
    //    int max = Integer.MIN_VALUE;
    //    while (i < numbers.length) {
    //
    //      if (max < numbers[i])
    //        max = numbers[i];
    //      i++;
    //
    //    }
    //    System.out.println(max);

    //    int [] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    //
    //    int i = 0;
    //    int positiveSum = 0;
    //    int negativeSum = 0;
    //
    //    while (i < numbers.length) {
    //
    //      if(numbers[i] > 0) {
    //        positiveSum += numbers[i];
    //      } else
    //        negativeSum += numbers[i];
    //      i++;
    //
    //    }
    //
    //    System.out.println(positiveSum);
    //    System.out.println(negativeSum);

//        int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//          if (i % 2 == 0)
//            sum += i;
//        }
//
//        System.out.println(sum);

      IntStream.range(1, 101).filter(i -> i % 2 == 0).forEach(System.out::println);
    //System.out.println(a);

    //    int sum = 0;
    //
    //    for (int i = 1; i <= 30; i++) {
    //
    //      if (i % 3 == 0 && i % 5 == 0) {
    //        sum += i + i;
    //      }
    //    }
    //    System.out.println(sum);

    // System.out.println(fibonacci(10));

//    int[] arr = new int[100];
//    arr[0] = 1;
//    arr[1] = 1;
//
//    for(int i = 2; i < arr.length; i++) {
//      arr[i] = arr[i-2] + arr[i-1];
//    }
//
//    for(int i = 0; i < arr.length; i++) {
//      System.out.println(arr[i]);
//    }

//    int[] fibArr = new int[10];
//    fibArr[0] = 1;
//    fibArr[1] = 1;
//
//    for(int i=2; i<10; i++) {
//
//      fibArr[i] = fibArr[i-2] + fibArr[i-1];
//
//    }
//
//    for(int i=0; i<10; i++) {
//
//      System.out.print(fibArr[i] + " ");
//
//    }

//    int[] arr = new int[10];
//    Arrays.setAll(arr, i->(i<2)?1:arr[i-1]+ arr[i-2]);
//    System.out.println(Arrays.toString(arr));
  }

  static int fib = 0;

  static int fibonacci(int n) {

    if(n == 1)
      return 1;

    if(n == 2)
      return 1;

    return fibonacci(n-1) + fibonacci(n-2);
  }

}


