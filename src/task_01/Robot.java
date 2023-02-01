package task_01;

// Исправьте ошибки.
public class Robot extends Thread {

    Robot(String str) {
        super( str);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()/* метод взврата имени потока **/ + " Started");
        try {
            Thread.sleep(1500);/* поток засыпает на 1,5 секунды **/
            System.out.println(Thread.currentThread().getName()/* метод взврата имени потока **/ + " Waiting...");
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println(Thread.currentThread().getName()/* метод взврата имени потока **/ + " Stopped");
    }
}
