package day8.abstract_test;

public abstract class Phone {

  private String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("Phone is turned on");
  }

  public void turnOff() {
    System.out.println("Phone is turned off");
  }
}
