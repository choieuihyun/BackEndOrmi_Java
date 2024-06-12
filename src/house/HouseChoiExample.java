package house;

public class HouseChoiExample {

    public static void main(String[] args) {
        HouseChoi person = new HouseChoi("계백");
        HouseChoi person2 = new HouseChoi("계백");
        HouseChoi person3 = new HouseChoi("계백");
        HouseChoi person4 = new HouseChoi("계백");

        System.out.println(HouseChoi.nation);
        System.out.println(person2.nation);
        System.out.println(person3.nation);
        System.out.println(person4.nation);
        System.out.println(person.name);

    }
}
