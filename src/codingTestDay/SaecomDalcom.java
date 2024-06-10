package codingTestDay;

public class SaecomDalcom {

    public static void main(String[] args){



    }

    static String saecomDalcom(int n){

        //       if(n % 3 == 0 && n %5 == 0){
//           return "새콤달콤";
//       }else if( n%3 == 0 ){
//           return "새콤!";
//       } else if(n%5 == 0){
//           return "달콤!";
//       } else{
//           return n + "!";
//       }

        boolean saecom = n % 3 == 0; // 이런 식으로 하는게 진짜 깔끔하긴 하네 ㅇㅇ..
        boolean dalcom = n % 5 == 0;

        if(saecom && dalcom) return "새콤달콤";
        if(saecom) return "새콤!";
        if(dalcom) return "달콤!";
        return n+"!";


    }

}
