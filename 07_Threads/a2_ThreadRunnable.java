
class A implements Runnable
{
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hii");
        }
    }
}

class B implements Runnable
{
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hello");
        }
    }
}

public class a2_ThreadRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
