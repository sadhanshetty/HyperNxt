import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("the number "+num+" is an even num");
        }
        else{
            System.out.println("the number "+num+" is an odd number");
        }
    }
}
