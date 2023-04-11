package Java.PJS.Javagit2;

public class Time {
    public int hour;
    public int minute;
    public int second;

    // 첫 번째 생성자
    public Time() {
        this(0, 0, 0);
    }

    // 두 번째 생성자
    public Time(int h, int m, int s) {
        hour = ((h > 0 && h < 24) ? h : 0); //
        minute = ((m > 0 && m < 60) ? m : 0); // 시간검증
        second = ((s > 0 && s < 60) ? m : 0); //
    }

    // "시:분:초" 출력
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
