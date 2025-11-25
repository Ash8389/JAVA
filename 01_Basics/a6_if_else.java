public class a5_if_else {
    public static void main(String[] args) {
        boolean check = true;
        if(check == true){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

        String s1 = "Hello";
        String s2 = "World";

        if(s1 == "Hello"){
            System.out.println("Hello");
            if(s2 == "World")
                System.out.println("World");
        }else if(s1 == "123"){
            System.out.println("123");
            if(s2== "456")
                System.out.println("456");
        }else{
            System.out.println("Nothing to print");
        }
    }
}
