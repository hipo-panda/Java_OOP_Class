public class AutoCar implements OperaterCar {
        @Override
    public void start() {
        System.out.println("출발!");
    }

    @Override
    public void stop() {
        System.out.println("멈춰!");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("차속도 " + speed + "km/h.");
    }

    @Override
    public void turn(int degree) {
        System.out.println("차방향" + degree + " degrees.");
    }
}
