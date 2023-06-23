interface myInterFace {
    static void print(String msg) {
        System.out.println(msg + "인터페이스의 정적 메소드 호출");
    }
}

public class StaticMethodTest{
    public static void main(String[] args) {
        myInterFace.print("Java s");
    }
}