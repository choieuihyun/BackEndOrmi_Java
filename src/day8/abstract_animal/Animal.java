package day8.abstract_animal;

public abstract class Animal {

  protected String kind;

  public void move() {
    System.out.println("이동합니다.");
  }

  public void eat() {
    System.out.println("먹습니다.");
  }

  public void sleep() {

  }

  public abstract void bark();

}
