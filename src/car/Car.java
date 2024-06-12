package car;

public class Car {

  private int speed;
  private int gear;
  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {

    if (speed < 0) {
      this.speed = 0;
    } else {
      this.speed = speed;
    }
  }


}
