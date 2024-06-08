package codingTestDay;

import java.util.Scanner;

public class printText {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";

        for(int i = 0; i < someTxt.length(); i++){

            if(someTxt.charAt(i) != ' '){
                System.out.println(someTxt.charAt(i));
            }

        }

    }

}
