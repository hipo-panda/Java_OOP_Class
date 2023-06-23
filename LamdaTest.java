
interface MyInterFace {
    void sayhello();
}
public class LamdaTest {
    public static void main(String[] args) {
        MyInterFace hello = () -> System.out.println("Hello");
        hello.sayhello();
    }
}