public class a0_ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try
        {
            System.out.println(str.length());
            j = 5/i;
            System.out.println(nums[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing out of bound index of array");
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }catch(Exception e){
            System.out.println("Other exception: " + e);
        }

        System.out.println("Value of j is: " + j);
    }
}
