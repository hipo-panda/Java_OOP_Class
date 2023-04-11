package Java.PJS.Javagit2;

public class BBOOXX {
    int width, length, height;
    int volume;

    BBOOXX(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
        volume = w * l * h;
    }

    BBOOXX whosLargest(BBOOXX box1, BBOOXX box2) {
        if (box1.volume > box2.volume)
            return box1;
        else
            return box2;
    }
}
