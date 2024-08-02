import java.util.Scanner;
public class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number ");
        int a = scan.nextInt();
        System.out.println("enter the second number");
        int b = scan.nextInt();
        System.out.println("enter the third number");
        int c = scan.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" is the greatest number among "+a+","+b+","+c);
        }
        else if(b>c){
            System.out.println(b+" is the greatest number among "+a+","+b+","+c);
        }
        else{
            System.out.println(c+" is the greatest number among "+a+","+b+","+c);
        }
    }
}
