public class AccountTest {
    public static void main(String[] args) {

        Account obj = new Account();
        obj.setName("우성준");
        obj.setMoney(100000000);
        System.out.println(obj.getName() + "님의 잔고는 " + obj.getMoney() + "원 이었으면 좋겠습니다.");
    }
}
