package Java.PJS.teststatic;

public class Bear extends Animal {

    private int legs = 4;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void roar() {
        System.out.println("roar()가 호출되었음.");
    }

}
