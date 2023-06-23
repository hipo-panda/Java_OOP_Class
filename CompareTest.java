public class CompareTest {
        public static void FindLarger(Compare c1, Compare c2){
        if(c1.compareTo(c2) == 0) {
            System.out.println("같아요.");
        } else if(c1.compareTo(c2) > 0) {
            System.out.println(c1 + " 커요.");
        } else {
            System.out.println(c2 + " 커요.");
        }
    };

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(120, 25);
        System.out.println(r1);
        Rectangle r2 = new Rectangle(150, 15);
        System.out.println(r2);
        FindLarger(r1, r2);
    };
}
