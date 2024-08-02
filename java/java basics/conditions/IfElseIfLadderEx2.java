public class IfElseIfLadderEx2 {
    public static void main(String[] args) {
        int age =10;
        if(age<=0){
            System.out.println("enter the valid age ");
        }
        else if(age>1&&age<18){
            System.out.println("not eligible for vote");
        }
        else{
            System.out.println("eligible for vote");
        }
    }
}
