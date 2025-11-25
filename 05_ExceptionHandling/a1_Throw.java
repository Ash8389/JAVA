
public class a1_Throw {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        try {
            j = j/i;
            if(j==0)
                throw new ArithmeticException("j can't be zero");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("Done");
    }    
}
