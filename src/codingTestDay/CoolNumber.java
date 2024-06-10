package codingTestDay;

public class CoolNumber {

    public static void main(String[] args){

    System.out.println(cool(13));
  }

    static boolean cool(int num) {

        if(num >= 0)
            return num % 11 == 0 || num % 11 == 1;

        return false;

    }

}


