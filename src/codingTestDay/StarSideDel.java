package codingTestDay;

import java.util.stream.Stream;

public class StarSideDel {

    public static void main(String[] args){

    System.out.println(starSideDel("wacy*xko"));
    }

    static String starSideDel(String str){

        return str.indexOf("*") > 0 ? str.substring(0,str.indexOf("*")) + str.substring(str.indexOf("*")+2, str.length()) : str;

    }

}
