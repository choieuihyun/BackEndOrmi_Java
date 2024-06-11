package day6;

public class Person {

  String name;
  int phoneNumber;
  int age;
  int money;

  public Person(String name, int phoneNumber, int age, int money) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.money = money;
  }

  public void sayHello() {
    System.out.println("my name is " + name);
  }

  public void sayMoney() {
    System.out.println("my money is " + money * 100);
  }

  public void teaching(Student student) {
    student.levelUp();
  }

  public void cheating(Student student) {
    student.levelDown();
  }
}
