package day7;

public class UseBankPerson {

    private String name2;
    String name;
    int age;
    int gold = 999999999;

    public UseBankPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 즉 요청은 퍼블릭으로 받아서 검증로직은 클래스 내에서 프라이빗으로 검증하는 것이다.
    private String checkAmount(int amount) {
        if (amount > this.gold) {
            return "요청하신 금액이 너무 큽니다.";
        }
        return "정상처리되었습니다.";
    }

    public String deposit(int amount) {
        return this.checkAmount(amount);

    }

}
