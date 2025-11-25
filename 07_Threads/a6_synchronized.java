

class Counter
{
    int count;

    public synchronized void increment() {
        count++;
    }
}


public class a6_synchronized {
    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 0; i<1000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 0; i<1000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(c.count);//. Due to Synchronized it will give 2000 always.
    }
}
