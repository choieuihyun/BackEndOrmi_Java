package day8.calculator;

public class Computer extends Calculator {

  @Override
  double areaCircle(double radius) {
    return Math.PI * radius * radius;
  }

  @Override
  public void say() {
    System.out.println("sdfsdfsdfsdf");
  }
}
