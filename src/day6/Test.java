package day6;

import daily_quiz.Computer;
import daily_quiz.Euihyun;

public class Test {

  public static void main(String[] args) {

    Euihyun eh = new Euihyun(26, 5000, "male");
    Computer computer = new Computer();
    eh.turnOnComputer(computer, 3000);
    eh.turnOnComputer(computer, 3000);
    eh.turnOffComputer(computer);


  }
}
