public class a16_WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        // Integer num2 = new Integer(num); //. This syntax is not used
        Integer num2 = num; //.Autoboxing
        
        int num3 = num2; //.Auto-Unboxing

        num3 = num2.intValue(); //.Unboxing

        System.out.println(num3);

        String str = "12";
        int num4 = Integer.parseInt(str);


        System.out.println(num4*5);
    }
}
