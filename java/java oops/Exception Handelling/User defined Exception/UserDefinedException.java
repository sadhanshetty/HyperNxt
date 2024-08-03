import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
    
}
public class UserDefinedException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your password");
        String password = scan.nextLine();
        if(password.equals("1234")){
            System.out.println("login successful");
        }
        else{
            try{
                throw new InvalidPasswordException();
            }
            catch(Exception e){
                System.out.println("wrong password");
            }
            
        } 
        scan.close();
    }
}
