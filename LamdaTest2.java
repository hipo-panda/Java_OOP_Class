interface MyInterFace {
    public void calculate(int x, int y);
}

public class LamdaTest2 {
    public static void main(String[] args) {
        MyInterFace hello = (a, b) -> {
            int result = a*b ;
            System.out.println(result);
        };
        hello.calculate(10 , 20);
    }
}