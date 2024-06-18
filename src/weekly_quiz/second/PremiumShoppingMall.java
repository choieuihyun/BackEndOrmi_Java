package weekly_quiz.second;

public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int size) {
    super(size);
  }

  @Override
  public boolean checkOrderAvailability(Product product) {

    int stock = product.getStock();
    boolean checkOrder = false;

    if(stock >= 10) {
      checkOrder = true;
    }

    return checkOrder;

  }

}
