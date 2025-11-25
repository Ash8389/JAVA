package Packages;
import Packages.tools.Calc;
// import java.lang.*; //. this package is Automatically import every java file

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.sum(5, 5));
    }
}