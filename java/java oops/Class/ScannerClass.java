import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your nmae");
        String s= scan.nextLine();
        System.out.println("your name is "+s);
        scan.close();

    }
    
}
