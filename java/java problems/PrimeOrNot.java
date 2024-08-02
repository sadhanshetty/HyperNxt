import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        int len = n/2;
        boolean test =false;
        if(n==0||n==1){
            System.out.println("the entered num is not a prime");
        }
        else{
        for(int i=2;i<=len;i++){
            if(n%i==0){
                System.out.println("the num is not a prime");
                test=true;
                break;
            }
           
        }
        if(test == false){
            System.out.println("the num is prime");
           }          
    }
    }
}
