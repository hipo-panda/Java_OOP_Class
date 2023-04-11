package Java.PJS.Javagit2;

public class Student {
    private int number;
    private String name;
    private int age;

    Student() {
        number = 100;
        name = "우성준";
        age = 23;
    }

    Student(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Student [number =" + number + ", name = " + name + ", age = " + age + "]";

    }

}
