package Java.PJS.Javagit2;

public class BBOOXXTest {
    public static void main(String[] args) {

        BBOOXX obj1 = new BBOOXX(10, 20, 30);
        BBOOXX obj2 = new BBOOXX(30, 20, 30);

        BBOOXX largest = obj1.whosLargest(obj1, obj2);
        System.out.println("(" + largest.width + "," + largest.length + "," + largest.height + ")");
    }
}
