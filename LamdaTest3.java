import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaTest3 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList();
        list.add("AAA");
        list.add("bbb");
        list.add("CCC");
        list.add("ddd");
        list.add("EEE");

        Collections.sort(list);

        System.out.println("대소문자 구별");
        System.out.println(list);

        Collections.sort(list, (o1, o2) -> o1.compareToIgnoreCase(o2));
        System.out.println("대소문자 구별 x");
        System.out.println(list);
    }
}