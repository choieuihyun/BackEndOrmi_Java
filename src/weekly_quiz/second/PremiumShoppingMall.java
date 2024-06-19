package weekly_quiz.second;

public class PremiumShoppingMall extends ShoppingMall {

  public PremiumShoppingMall(int size) {
    super(size);
  }

  @Override
  public boolean checkOrderAvailability() {

    Product[] productArray = getProductArray();

    boolean checkAvailability = false;

      for (Product product : productArray) {

        if (product != null && product.getStock() >= 10)
          checkAvailability = true;
        else {
          checkAvailability = false;
          break;
        }

      }

    return checkAvailability;
  }
}
