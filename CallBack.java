import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CallBack {
    public static void main(String[] args) {
        ActionListener al = new TimerTest();

        // actionPerformed()를 호출
        Timer t = new Timer(2000, al); 

        t.start();
        
        for(int i=0; i<2000; i++) { 
            // try : 예외가 발생할 수 있는 코드를 try 블록 안에 넣음
            try{ 
                Thread.sleep(2000);
             // catch : try 블록 안에서 예외가 발생하면 처리할 코드를 넣음
            } catch (InterruptedException e) {

            }
        }

    }
}