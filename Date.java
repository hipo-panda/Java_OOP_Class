package Java.PJS.Javagit2;

public class Date {
    private int year;
    private String month;
    private int day;

    public Date() { // 기본 생성자
        this(2023, "3월", 1);

    }

    public Date(int year, String month, int day) { // 생성자
        this.month = month;
        this.year = year;
        this.day = day;

    }

    @Override
    public String toString() {
        return "Date [year = " + year + " month = " + month + " day = " + day + "]";
    }
}
