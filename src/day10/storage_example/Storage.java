package day10.storage_example;

public interface Storage<T> {

    void add(T item, int index);

    T get(int index);

}
