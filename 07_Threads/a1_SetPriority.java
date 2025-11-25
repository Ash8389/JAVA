//. By seting priority for a thread we can only suggest the shedular for give priority to a higher priority thread when two thread goes at the same time but it totally depends on the shedular which thread will get execute first.
class A extends Thread
{
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }
    }
}
class B extends Thread
{
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

public class a1_SetPriority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(5); //. It has range from 1-10

        obj1.start();
        obj2.start();

    }
}
