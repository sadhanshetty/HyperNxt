import java.util.Scanner;

public class ExceptionThrowsKeyword {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter numerator");
        int a = scan.nextInt();
        System.out.println("Enter denominator");
        int b = scan.nextInt();

	   try {
		   divide(a,b);
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
       finally{
        scan.close();
       }
   }
    static void divide(int a ,int b) throws Exception {
    System.out.println(a/b);
}
		
   }