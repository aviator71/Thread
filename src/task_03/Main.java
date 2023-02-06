package task_03;

// Вывод групп товаров.
// Исправьте ошибки.
public class Main extends Thread {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);
        getVeges(group);
        getBerries(group);
    }

    private static void getFruits(ThreadGroup group) throws InterruptedException {
        Fruits fruits = new Fruits(Fruits.currentThread(), "\nFruits:");
        fruits.start();
        fruits.join();/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(Veges.currentThread(), "\nVeges:");
        veges.start();
        veges.join();/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static void/* ??? **/ getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(Berries.currentThread(), "\nBerries:");
        berries.start();
        berries.join();/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }
}
