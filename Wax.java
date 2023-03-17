public class Wax {
    private int width, length, heigth;

    public Wax(int w, int l, int h) {
        width = w;
        length = l;
        heigth = h;
    }

    public int getVolume() {
        return width * heigth * length;
    }

    public static Wax whoisLargerWax(Wax wax1, Wax wax2) {
        if (wax1.getVolume() > wax2.getVolume()) {
            return wax1;
        }
        return wax2;
    }

    public static void main(String[] args) {

        Wax w1 = new Wax(10, 30, 40);
        Wax w2 = new Wax(20, 40, 40);
        System.out.println("첫번 째 박스의 부피 : " + w1.getVolume());
        System.out.println("두번 째 박스의 부피 : " + w2.getVolume());

        Wax lagerWax = Wax.whoisLargerWax(w1, w2);
        System.out.println("더 큰 박스의 부피 : " + lagerWax.getVolume());
    }
}
