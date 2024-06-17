package weekly_quiz.second;

public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int size) {
    super(size);
  }

  @Override
  public boolean checkOrderAvailability(Product product) {

    int stock = product.getStock();

    if (stock >= 10) {
      System.out.println("주문을 완료하였습니다.");
      return true;
    } else {
      System.out.println("재고가 부족합니다.");
      return false;
    }
  }
}
