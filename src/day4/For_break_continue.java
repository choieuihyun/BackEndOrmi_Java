package day4;

public class For_break_continue {

  public static void main(String[] args) {

//    for (int i = 1; i <= 10; i++) {
//      if (i == 4 || i == 7) continue;
//      System.out.println(i);
//    }

//    int i = 0; // 초기화식
//
//    while(i < 10){
//
//      if(i == 5){
//        i++;
//        continue;
//      }
//      System.out.println(i);
//      i++;
//    }

    for(int i=2; i<10; i++) {

      for(int j=1; j<10; j++) {

        if(j == 5)
          continue;

        System.out.print(i * j + " ");

      }
      System.out.println();
      if(i == 5)
        break;
    }

  }
}
