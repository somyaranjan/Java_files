import java.util.*;
public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A:");
        int a = sc.nextInt();
        System.out.println("Enter value of B:");
        int b = sc.nextInt();
        sc.close();
        //addition operator
        System.out.println(a+" + "+b+" = "+(a+b));
        //substraction operator
        System.out.println(a+" - "+b+" = "+(a-b));
        //multiplication operator
        System.out.println(a+" * "+b+" = "+(a*b));
        //division operator
        System.out.println(a+" / "+b+" = "+(a/b));
        //remainder operator
        System.out.println(a+" % "+b+" = "+(a%b));
    }
}