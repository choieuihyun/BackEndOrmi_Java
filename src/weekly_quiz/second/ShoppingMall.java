package weekly_quiz.second;

import javax.swing.*;

public abstract class ShoppingMall {

  private int productCount;
  private Product[] productArray;

  public ShoppingMall(int size) {

    this.productCount = 0;
    this.productArray = new Product[size];
  }

  public abstract boolean checkOrderAvailability(Product product);

  // 제품 추가 메서드
  public void productManagement(Product product) {

    productArray[productCount++] = product;
  }

  // 제품 삭제 메서드
  public void productManagement(String name) {

    for(int i=0; i<productArray.length; i++) {
      if (productArray[i] != null && productArray[i].getName().equals(name)) {
        productArray[i] = null;
      }
    }
  }

  // 제품 목록 출력 메서드
  public void productManagement() {

    for (Product product : productArray) {
      if (product instanceof Clothing)
        System.out.println("물품명 : " + product.getName() + " | " + "재고 : " + product.getStock() + " | "
                + "가격 : " + product.calculatePrice() + " | " + "사이즈 : " + ((Clothing) product).getSize());
      else if (product instanceof Electronics)
        System.out.println("물품명 : " + product.getName() + " | " + "재고 : " + product.getStock() + " | "
                + "가격 : " + product.calculatePrice() + " | " + "브랜드 : " + ((Electronics) product).getBrand());
      else if(product instanceof Food)
        System.out.println("물품명 : " + product.getName() + " | " + "재고 : " + product.getStock() + " | "
                + "가격 : " + product.calculatePrice() + " | " + "유통기한 : " + ((Food) product).getExpirationDate());
        else
          System.out.println("물품이 없습니다.");
      }
    }
  }

