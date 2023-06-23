interface Flyable {
    void fly();
};

class Car{
    int speed;
    void setSpeed(int speed){
        this.speed = speed;
    }
};

// 하나의 클래스가 클래스, 인터페이스를 각각 하나씩 상속.
public class FlyingCar2 extends Car implements Flyable {
    public void fly(){
        System.out.println("I'm flying!");
    }

    public static void main(String[] args) {
        FlyingCar2 obj = new FlyingCar2();
        obj.setSpeed(500); 
        System.out.println(obj.speed); 
        obj.fly(); 
    }
};