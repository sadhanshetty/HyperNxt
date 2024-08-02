class Accounts{
    
    static{
        System.out.println("hi");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("hello");
        new Accounts();
        {
            System.out.println("how are you");
        }
    }
}
