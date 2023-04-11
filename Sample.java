package Java.PJS.teststatic;

/*
 * 정적멤머 : static, class level에 존재, class의 모든 instance가 공유
 *  instance member에 접근 X
 * 언제사용? : 값을 모든 instance에 공유할 때, 상수, instance member에 접근할 필요 X
 * 
 * 내장 class(Nested Class) : 정적내부 class
 *                            비정적 내부 class : inner class, local class, Anonymous
 * 
 * 상속 
 * Parent - child 관계 : 
 */

public class Sample {
    public static int myVar = initialize();

    private static int initialize() {
        return 0;

    }
}
