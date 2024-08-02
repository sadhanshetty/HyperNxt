class Father1 {
    int a=20;
}
class Son1 extends Father1{
    int b =25;

}
public class DownCasting {
    public static void main(String[] args) {
        Father1 f1 = new Son1(); //upcasting (implicit) can only access parent members
        Son1 s1 = (Son1)f1; // explicitly downcasting, can acces both parent and child members
        System.out.println(s1.a);
        
    }
    
}
