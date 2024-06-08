package codingTestDay;

public class searchArray {

  public static void main(String[] args) {

    System.out.println(search2(new int[] {3, 5, 8, 2, 1}, 3));
  }

  static int search(int[] nums, int target) {

    int result = 0;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == target) {
        result = nums[i];
        break;
        }
      else
          result = -1;

    }

    return result;
  }

  static int search2(int[] nums, int target) {

    int result = -1;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == target) {
        result = nums[i];
        break;
      }

    }
    return result;
  }
}
