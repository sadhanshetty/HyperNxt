import java.util.Scanner;

class InvalidPasswordException extends RuntimeException{
    private String message;
    InvalidPasswordException(String message){
    this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
public class UserDefinedExceptionOverridingGetMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your password");
        String password = scan.nextLine();
        if(password.equals("1234")){
            System.out.println("login successful");
        }
        else{
            try{
                throw new InvalidPasswordException("wrong password");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                scan.close();
            }
        }
    }
}
