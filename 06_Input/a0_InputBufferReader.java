import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class a0_InputBufferReader
{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num;

        try {
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } catch (IOException e) {
            System.out.println("Input Exception: "+e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}