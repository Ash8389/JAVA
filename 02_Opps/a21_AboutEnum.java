
enum Status //. Status is a kindof calls
{
    Running, Failed, Pending, Success; //. These are the object of class Status
}


public class a21_AboutEnum {
    public static void main(String[] args) {

        Status run = Status.Running;

        Status []s = Status.values();

        // for (Status state : s) {
        //     System.out.println(state);
        // }

        switch (run) {
            case Running:
                System.out.println("It is Running");
                break;
            case Failed:
                System.out.println("It is Failed");
                break;
            case Pending:
                System.out.println("It is Pending");
                break;
            case Success:
                System.out.println("It is Success");
                break;
            default:
                System.out.println("Wrong code.");
                break;
        }
    }
}
