
public class Box {
    private int width;
    private int length;
    private int heigth;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public Box(int w, int l, int h) {
        width = w;
        length = l;
        heigth = h;
        volume = width * length * heigth;
    }

    /*
     * 인자로 주어지는 Box 객체와 동일한 너비와 높이를 가지는 Box인지 체크하는 메소드
     * 같으면 true, 다르면 false를 반환
     */
    public boolean isSameBox(Box box) {
        /*
         * 나의 width, length, height가 인자로 주어진 box의 그것과 모두 같으면 true로 반환
         * 그렇지 않으면 flase를 반환.
         */
        if (width == box.width && length == box.length && heigth == box.heigth)
            return true;
        return false;
    }

    public static void main(String[] args) {

        Box b;
        b = new Box(20, 20, 30);
        System.out.println("상자의 부피는" + b.getVolume() + "입니다.");
    }
}
