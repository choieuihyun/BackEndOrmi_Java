package daily_quiz;

public class Computer {

  boolean turnOn = false;
  int insane = 0;

  public void turnOn(int money) {

    if (!turnOn) {
      turnOn = true;
      insane += money;
      System.out.println("컴퓨터를 켰습니다.");
    } else System.out.println("컴퓨터가 켜져있습니다.");

  }

  public void turnOff() {

    if (turnOn) {
      turnOn = false;
      System.out.println("컴퓨터를 껐습니다.");
    } else System.out.println("컴퓨터가 꺼져있습니다.");
  }

}
