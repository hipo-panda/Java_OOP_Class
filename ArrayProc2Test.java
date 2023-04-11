package Java.PJS.Javagit2;

public class ArrayProc2Test {
    final static int Student = 5;

    public static void main(String[] args) {

        int[] scores = new int[Student];
        ArrayProc obj = new ArrayProc();
        obj.getValues(scores);
        System.out.println("평균은" + obj.getAverage(scores));
    }
}
