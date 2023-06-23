import java.util.*;

public class CollectionTest {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("우성준");
    names.add("김현");
    names.add("김유민");
    names.add("안영진");
    names.add("조현준");
    names.add("김정원");

    for (String name : names) {
      System.out.println(name);
    }

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(23);
    ages.add(22);
    ages.add(25);
    ages.add(25);
    ages.add(23);

    for (int age : ages) {
      System.out.println(age);
    }
  }
}
