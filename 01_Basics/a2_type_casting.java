public class a2_type_casting {
    public static void main(String[] args) {
            //Widening Casting (automatic) - converting a smaller type to a larger type size
            // byte -> short -> char -> int -> long -> float -> double

            // Narrowing Casting (manual) - converting a larger type to a smaller type size
            // double -> float -> long -> int -> char -> short -> byte

            int a = 257;
            // byte b = a; //-> This will give an error
            byte b = (byte)a; //-> It will store modular value 257 % 256 = 1
            System.out.println(b);
            
            float f = 102.565f;
            a = (int)f; //-> Remove value after .
            System.out.println(a);

            char ch = 'a';
            int x = ch;
            System.out.println(x);

    }    
}
