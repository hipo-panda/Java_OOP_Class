package Java.PJS.Javagit2;

import java.util.Scanner;

public class ArrayProc2 {
    public void getValues(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("성적을 입력하세요");
            array[i] = scan.nextInt();
        }
    }

    public double getAverage(int[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++)
            total += array[i];
        return total / array.length;
    }
}
