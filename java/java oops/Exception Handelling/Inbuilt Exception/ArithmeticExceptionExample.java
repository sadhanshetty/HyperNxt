import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value for numerator");
        int a = scan.nextInt();
        System.out.println("enter the value for denominator");
        int b =scan.nextInt();
        try{
            System.out.println(a+" divide by "+b+" is "+a/b);
        }
        catch(ArithmeticException e){
            System.out.println("infinity");
        }
        scan.close();
    }
}
