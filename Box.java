public class Box {
    private int width;
    private int length;
    private int heigth;
    private int volume;

    public int getVolume() {
        return volume;
    }

    Box(int w, int l, int h) {
        width = w;
        length = l;
        heigth = h;
        volume = width * length * heigth;
    }
}
