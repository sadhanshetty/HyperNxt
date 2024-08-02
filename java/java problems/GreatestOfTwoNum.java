import java.util.Scanner;
public class GreatestOfTwoNum {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the first number ");
       int num1 = scan.nextInt();
       System.out.println("enter the second number");
       int num2 = scan.nextInt();
       int res = (num1>num2?num1:num2);
       System.out.println("the greatest number among "+num1+" and "+num2+" is "+res);
    }
}
