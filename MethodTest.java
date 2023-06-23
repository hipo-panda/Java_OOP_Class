interface myInterFace {
    // 추상 메소드
    public void myMethod1();

    // 디폴트 메소드: 인터페이스 내에서 메소드의 디폴트 구현을 제공하는 기능
    default void myMethod2 () {
        System.out.println("myMethod2()");
    }
}

public class MethodTest implements myInterFace{
    @Override
    public void myMethod1() {
        System.out.println("myMethod1()");
    }
    public static void main(String[] args) {
        MethodTest obj = new MethodTest();

        obj.myMethod1(); 
        // 디폴트 메소드는 인터페이스를구현하는 클래스에서 구현하지 않아도 바로 사용가능
        obj.myMethod2(); 
    }
}