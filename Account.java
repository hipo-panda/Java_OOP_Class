public class Account {

    private int number; //
    private String name; // 필드가 private로 선언되어 클래스 내부에서만 사용이 가능하다.
    private int money; //

    public String getName() {
        return name;
    } // 접근자와 생성자

    public void setName(String name) {
        this.name = name;
    } // 접근자와 생성자

    public int getMoney() {
        return money;
    } // 접근자와 생성자

    public void setMoney(int money) {
        this.money = money;
    } // 접근자와 생성자
}
