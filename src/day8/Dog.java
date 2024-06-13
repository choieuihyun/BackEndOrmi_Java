package day8;

public class Dog extends Animal {

  int age;

  void sleep(int times) {
    System.out.println(name + " zzz...." + times + " hours");
  }

  public Dog(int age){
    super("okay","남"); // 이거 바로 아래 코드랑 뒤집으면 실행 안된다. 왜? super로 부모 인스턴스가 생성되어야 하는데 부모 인스턴스가 생성되지 않은 상태로
    this.age = age; // 자식인 this에 데이터 넣으려고하면 당연히 안되지.

    // new Animal();
  }

  void sleep(int times, int a) {}
}