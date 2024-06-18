package day10.generic_test;

public class Util {
    public static <T extends Number> int compare(T t1, T t2) {
        int v1 = t1.intValue();
        int v2 = t2.intValue();
        return Integer.compare(v1, v2);
    }


}
