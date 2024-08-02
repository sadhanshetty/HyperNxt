import java.util.Scanner;

public class SwithStatementEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number from 1-5");
        int choice = scan.nextInt();

        switch (choice) {
            case 1: 
                System.out.println("idli");
                break;
            case 2:
                System.out.println("dose");
                break;
            case 3: 
                System.out.println("upma");
                break;
            case 4:
                System.out.println("palav");
                break;
            case 5:
                System.out.println("lemon rice");
                break;
        
            default:System.out.println("enter a valid choice");
                break;
        }
        scan.close();
    }
}
