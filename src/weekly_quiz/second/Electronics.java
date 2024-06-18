package weekly_quiz.second;

import java.util.Objects;

public class Electronics extends Product {

    private String brand;

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);

        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    
    // 수정 필요
    @Override
    public int calculatePrice() {

        int price = getPrice();

        if(Objects.equals(this.brand, "Apple"))
            price = (int) (price * 1.2);

        return price;
    }
}
