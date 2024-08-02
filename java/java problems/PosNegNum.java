import java.util.Scanner;
public class PosNegNum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = scan.nextInt();
        if(num>0){
            System.out.println("The number "+num+ " is a positive number");
        }
        else if(num< 0){
            System.out.println("The number "+num+" is a negative number");
        }
        else{
            System.out.println("the entered num is zero");
        }
        
        

    }
}