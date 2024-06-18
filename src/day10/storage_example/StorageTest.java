package day10.storage_example;

public class StorageTest {

    public static void main(String[] args){

        ChildProduct<Tv, String, String> product = new ChildProduct<>();

        product.setKind(new Tv());
        product.setModel("Smart TV");
        product.setCompany("Samsung");

        StorageImpl<Tv> tvStorage = new StorageImpl<>(10);
        tvStorage.add(new Tv(), 4);

    }

}
