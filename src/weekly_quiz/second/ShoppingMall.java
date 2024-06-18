package weekly_quiz.second;

import javax.swing.*;
import java.util.Arrays;

public abstract class ShoppingMall {

  private int productCount;
  private Product[] productArray;

  public ShoppingMall(int size) {

    this.productCount = 0;
    this.productArray = new Product[size];
  }

  public abstract boolean checkOrderAvailability(Product product);

  // 제품 추가 메서드
  public void addProduct(Product product) {
    if (productCount >= productArray.length) {
      System.out.println("재고 칸을 늘렸습니다.");
      productArray = Arrays.copyOf(productArray, productCount * 2);
    }
    productArray[productCount++] = product;
  }

  // 제품 삭제 메서드
  public void removeProduct(String name) {

    for (int i = 0; i < productArray.length; i++) {
      if (productArray[i] != null && productArray[i].getName().equals(name)) {
        System.out.println(productArray[i].getName() + "을 삭제했습니다.");
        productArray[i] = null;
      } else if (productArray[i] == null || !productArray[i].getName().equals(name)) {
        System.out.println("없는 제품이기 때문에 삭제에 실패했습니다.");
      }
    }
  }

  public void removeProduct(Product product) {

    for (int i = 0; i < productArray.length; i++) {
      if (productArray[i] != null && (productArray[i] == product)) {
        System.out.println(productArray[i].getName() + "을 삭제했습니다.");
        productArray[i] = null;
      }
    }
  }

  // 제품 목록 출력 메서드
  public void displayProducts() {

    for (Product product : productArray) {
      if (product instanceof Clothing)
        System.out.println(
            "물품명 : "
                + product.getName()
                + " | "
                + "재고 : "
                + product.getStock()
                + " | "
                + "가격 : "
                + product.calculatePrice()
                + " | "
                + "사이즈 : "
                + ((Clothing) product).getSize());
      else if (product instanceof Electronics)
        System.out.println(
            "물품명 : "
                + product.getName()
                + " | "
                + "재고 : "
                + product.getStock()
                + " | "
                + "가격 : "
                + product.calculatePrice()
                + " | "
                + "브랜드 : "
                + ((Electronics) product).getBrand());
      else if (product instanceof Food)
        System.out.println(
            "물품명 : "
                + product.getName()
                + " | "
                + "재고 : "
                + product.getStock()
                + " | "
                + "가격 : "
                + product.calculatePrice()
                + " | "
                + "유통기한 : "
                + ((Food) product).getExpirationDate());
      else System.out.println("물품이 없습니다.");
    }
  }

  // 제품 주문 가능 여부 판단을 위한 제품 검색 메서드
  public Product searchProduct(String name) {
    for (int i = 0; i < productArray.length; i++) {
      if (productArray[i] != null && productArray[i].getName().equals(name)) {
        return productArray[i];
      }
    }
    return null;
  }
}
