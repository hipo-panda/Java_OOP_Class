import javax.swing.Timer;

public class CallBack2 {
    public static void main(String[] args) {
        Timer t = new Timer(2000, event -> System.out.println("삐입"));
        t.start();

        for(int i=0; i<2000; i++) {
            try {
                Thread.sleep(2000);                
            } catch (InterruptedException e) {
                
            }
        }
    }    
}