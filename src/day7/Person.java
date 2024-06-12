package day7;

public class Person {

  String name;
  int age;
  static final String gender = "남";

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello my name is : " + this.name);
  }

  public void introduce() {
    System.out.println("Hello my age is : " + this.age);
  }

}
