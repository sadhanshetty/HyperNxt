abstract class ABCD{
    abstract void dispp();
}

class DCBA extends ABCD{
    void dispp(){
        System.out.println("displaying something");
    }
}
public class AbstractionExample {
    public static void main(String[] args) {
        ABCD a = new DCBA();
        a.dispp();
    }
}
