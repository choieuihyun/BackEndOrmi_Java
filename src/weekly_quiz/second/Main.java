package weekly_quiz.second;

import java.util.Objects;
import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    PremiumShoppingMall premiumShoppingMall = new PremiumShoppingMall(20);

    while (true) {

      System.out.println("\n원하는 동작의 번호를 입력하세요.");
      System.out.println("1. 제품 추가(옷, 전자기기, 식품) / 2. 제품 삭제 / 3. 제품 목록 출력 / 4. 제품 주문 가능 여부");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          {
            System.out.println("옷, 전자기기, 식품 중 택 1");
            String type = scanner.nextLine();

            if (type.equals("옷")) inputClothes(premiumShoppingMall);
            else if (type.equals("전자기기")) inputElectronics(premiumShoppingMall);
            else if (type.equals("식품")) inputFood(premiumShoppingMall);
            else System.out.println("잘못된 타입입니다.");
            break;
          }
        case 2:
          {
            System.out.println("삭제할 물품 명을 입력하세요.");
            String name = scanner.nextLine();
            premiumShoppingMall.productManagement(name);
            break;
          }
        case 3:
          {
            premiumShoppingMall.productManagement();
            break;
          }
        case 4:
          {
            premiumShoppingMall.checkOrderAvailability();
          }
      }
    }

    //    Product gucci = new Clothing("구찌", 1200000, 10, "L");
    //    Product electronics = new Electronics("IPhone", 1300000, 2, "Apple");
    //    Product food = new Food("사과", 4000, 100, 5);
    //
    //    PremiumShoppingMall psm = new PremiumShoppingMall(20);
    //    psm.checkOrderAvailability(food);
    //
    //    psm.productManagement(gucci);
    //    psm.productManagement(electronics);
    //    psm.productManagement(food);
    //
    //    psm.productManagement();
  }

  static void inputClothes(PremiumShoppingMall shoppingMall) {

    System.out.println("상품명 입력");
    String name = scanner.nextLine();
    System.out.println("가격 입력");
    int price = scanner.nextInt();
    System.out.println("재고 입력");
    int stock = scanner.nextInt();
    scanner.nextLine();
    System.out.println("사이즈 입력(S,M,L,XL,XXL,XXXL)");
    String size = scanner.nextLine();

    Product clothes = new Clothing(name, price, stock, size);
    shoppingMall.productManagement(clothes);
  }

  static void inputElectronics(PremiumShoppingMall shoppingMall) {

    System.out.println("상품명 입력");
    String name = scanner.nextLine();
    System.out.println("가격 입력");
    int price = scanner.nextInt();
    System.out.println("재고 입력");
    int stock = scanner.nextInt();
    scanner.nextLine();
    System.out.println("브랜드 명 입력");
    String brand = scanner.nextLine();

    Product electronics = new Electronics(name, price, stock, brand);
    shoppingMall.productManagement(electronics);
  }

  static void inputFood(PremiumShoppingMall shoppingMall) {

    System.out.println("상품명 입력");
    String name = scanner.nextLine();
    System.out.println("가격 입력");
    int price = scanner.nextInt();
    System.out.println("재고 입력");
    int stock = scanner.nextInt();
    System.out.println("유통기한 입력");
    int expiration = scanner.nextInt();

    Product food = new Food(name, price, stock, expiration);
    shoppingMall.productManagement(food);
  }
}
