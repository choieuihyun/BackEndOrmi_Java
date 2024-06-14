package day8.abstract_test;

public class IPhone extends Phone {

  public IPhone(String owner) {
    super(owner);
  }

  public void internetSearch() {
    System.out.println("인터넷 검색을 합니다.");
  }
}
