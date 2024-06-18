package day10;

public class CompareStringTest {

    public static void main(String[] args){
        compare("sdf","sdf");
    }

    static <T extends String> void compare (T t1, T t2) {
        System.out.println(t1.equals(t2) ? "okay" : "no");
    }
}
