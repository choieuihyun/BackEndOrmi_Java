package weekly_quiz.second;

import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    PremiumShoppingMall premiumShoppingMall = new PremiumShoppingMall(1);

    while (true) {

      int choice;

      try {
        System.out.println("\n원하는 동작의 번호를 입력하세요.");
        System.out.println("1. 제품 추가(옷, 전자기기, 식품) / 2. 제품 삭제 / 3. 제품 목록 출력 / 4. 제품 주문 가능 여부 / 5. 종료");
        choice = scanner.nextInt();
        scanner.nextLine();
      } catch (Exception e) {
        System.out.println("잘못된 입력입니다.");
        scanner.nextLine(); // 이거에 주의해야하는게 좀 어렵다.
        continue; // 바로 반복 넘어가야 또 실행된다.
      }

      switch (choice) {
        case 1:
          {
            System.out.println("옷, 전자기기, 식품 중 택 1");
            String type = scanner.nextLine();

            if (type.equals("옷")) inputClothes(premiumShoppingMall);
            else if (type.equals("전자기기")) inputElectronics(premiumShoppingMall);
            else if (type.equals("식품")) inputFood(premiumShoppingMall);
            else System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            break;
          }
        case 2:
          {
            System.out.println("1. 물품 전체 삭제 / 2. 물품 개별 삭제");

            try {
              int removeChoice = scanner.nextInt();
              scanner.nextLine();

              System.out.println("삭제할 물품의 이름을 입력하세요.");
              String name = scanner.nextLine();

              if (removeChoice == 1) {
                premiumShoppingMall.removeProduct(name);
              } else if (removeChoice == 2) {
                Product product = premiumShoppingMall.searchProduct(name);
                premiumShoppingMall.removeProduct(product);
              }

            } catch (Exception e) {
              System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }

            break;
          }
        case 3:
          {
            premiumShoppingMall.displayProducts();
            break;
          }
        case 4:
          {
            boolean checkOrder = premiumShoppingMall.checkOrderAvailability();
            if (checkOrder)
              System.out.println("주문이 가능합니다");
            else
              System.out.println("재고가 부족하여 주문이 불가능합니다");

//            System.out.println("주문하고 싶은 제품의 이름을 입력하세요.");
//            String name = scanner.nextLine();
//            Product product = premiumShoppingMall.searchProduct(name);
//
//            if (product != null) {
//              boolean checkOrder = premiumShoppingMall.checkOrderAvailability(product);
//              System.out.println(checkOrder ? "주문이 가능합니다." : "재고가 부족하여 주문이 불가능합니다.");
//            } else System.out.println("없는 제품입니다. 다시 입력해주세요");

            break;
          }
        case 5:
          return;
        default:
          System.out.println("올바른 동작(번호)을 선택하세요.");
      }
    }
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

    if (size.equals("S")
        || size.equals("M")
        || size.equals("L")
        || size.equals("XL")
        || size.equals("XXL")
        || size.equals("XXXL")) {

      Clothing clothes = new Clothing(name, price, stock, size);
      shoppingMall.addProduct(clothes);

    } else System.out.println("없는 사이즈입니다. 다시 주문해주세요.");
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

    Electronics electronics = new Electronics(name, price, stock, brand);
    shoppingMall.addProduct(electronics);
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

    Food food = new Food(name, price, stock, expiration);
    shoppingMall.addProduct(food);
  }
}
