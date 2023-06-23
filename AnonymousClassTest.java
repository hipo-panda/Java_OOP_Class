
interface RemoteControl {
    void turnOn();
    void turnOff();
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        RemoteControl ac = new RemoteControl() {
            public void turnOn() {
         System.out.println("전원 온");
            }
            public void turnOff() {
                System.out.println("전원 오프");
            }
        };
        ac.turnOn();
        ac.turnOff();
    }
}
