public class MycounterTest {
    public static void main(String[] args) {

        Mycounter obj1 = new Mycounter(100);
        Mycounter obj2 = new Mycounter(200);

        System.out.println("오브젝트 1의 COUNTER = " + obj1.counter);
        System.out.println("오브젝트 2의 COUNTER = " + obj2.counter);
    }
}
