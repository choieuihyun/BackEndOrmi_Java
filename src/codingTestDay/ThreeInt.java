package codingTestDay;

public class ThreeInt {

    public static void main(String[] args){

    System.out.println(isOrdered(1,3,3, true));
  }

    static boolean isOrdered(int first, int second, int third, boolean opt) {

//        if (opt) // 나는 이렇게 안하고 길게 if문 썼는데 공통적인 부분을 뽑아서 간단하게 처리해버릴수 있다는게 좀 생각하기 어렵다.
//            return second < third;
//        else // 세 파라미터간의 관계를 잘 파악해보는게 훈련이 되어야 함.
//            return first < second && second < third;

        return opt ? second < third : first < second && second < third;

    }

}
