package daily_quiz;

public class Euihyun {

  int age;
  int money;
  String gender;

  public Euihyun(int age, int money, String gender) {
    this.age = age;
    this.money = money;
    this.gender = gender;
  }

  public void turnOnComputer(Computer computer, int price) {

    if (money > price) {
      money -= price;
      computer.turnOn(price);
      System.out.println("남은 돈은 " + money + "원");
    } else
        System.out.println("돈이 없습니다.");

  }

  public void turnOffComputer(Computer computer) {
    computer.turnOff();
  }
}
