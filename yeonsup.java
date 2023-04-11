package Javagit2;

import java.util.*;

public class yeonsup {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month;

        do {
            System.out.print("올바른 월을 입력해!!!");
            month = input.nextInt();
        } while (month < 1 || month > 12);

        System.out.println(month);

    }
};
