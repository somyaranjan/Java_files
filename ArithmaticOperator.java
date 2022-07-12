import java.util.*;
public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A:");
        int a = sc.nextInt();
        System.out.println("Enter value of B:");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Addition : "+(a+b));
        System.out.println("Substraction : "+(a-b));
    }
}