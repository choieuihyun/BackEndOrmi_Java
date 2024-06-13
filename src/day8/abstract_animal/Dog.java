package day8.abstract_animal;

// 구현 클래스라고 명칭을 중요시 해야함.
public class Dog extends Animal {

  @Override
  public void bark() {
    System.out.println("월월");
  }
}
