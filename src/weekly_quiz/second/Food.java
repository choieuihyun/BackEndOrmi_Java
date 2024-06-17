package weekly_quiz.second;

public class Food extends Product {

    private int expirationDate;

    public Food(String name, int price, int stock, int expirationDate) {
        super(name, price, stock);

        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public int calculatePrice() {

        int price = getPrice();

        if(expirationDate <= 7)
            price = (int) (price * 0.8);

        return price;

    }
}
