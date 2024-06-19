package weekly_quiz.second;

public class Clothing extends Product {

  private String size;

  public Clothing(String name, int price, int stock, String size) {
    super(name, price, stock);

    this.size = size;
  }

  public String getSize() {
    return size;
  }

  @Override
  public int calculatePrice() {

    return switch (this.size) {
      case "S", "M" -> getPrice();
      case "L", "XL", "XXL", "XXXL" -> (int) (getPrice() * 1.1);
      default -> 0;
    };
  }

  @Override
  public String getInfo() {
    return "사이즈 : " + getSize();
  }
}
