package codingTestDay;

public class SumUnique {

    public static void main(String[] args){

    System.out.println(sumUnique(1,4,3));
    }

    static int sumUnique(int a, int b, int c){

        if(a==b && a==c) return 0;
        if(a==b) return c;
        if(b==c) return a;
        if(c==a) return b;

        return a+b+c;

    }

}
