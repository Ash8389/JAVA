@FunctionalInterface
interface A
{
    int show(int i, int j);    
}
// class B implements A
// {
//     public void show()
//     {
//         System.out.println("In show");
//     }
// }


public class a23_FunctionalInterface {
    public static void main(String[] args) {
        // A obj = new B();
        // obj.show();

        // A obj = new A() {
        //     public void show()
        //     {
        //         System.out.println("In show");
        //     }
        // };

        // A obj = () -> {
        //     System.out.println("In show");
        // };
        // A obj = () ->  System.out.println("In show");

        //->If there is parameters.
        // A obj = (i) ->  System.out.println("In show" + i);
        // A obj = i ->  System.out.println("In show" + i);
        
        
        //->If there is multiple parameters.
        // A obj = (i, j) ->  System.out.println("In show " + i+j);
        
        //-> Functions some value
        A obj = (i, j) ->  i+j;
        

        System.out.println(obj.show(5, 6));
    }
}
