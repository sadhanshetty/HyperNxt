class Objects{
    static{
        System.out.println("hiiii");;
    }
    static{
        System.out.println("some random sentence 1");
    }
}
public class StaticBlock2 {
    public static void main(String[] args) {
        {
            System.out.println("how are you");
        }
        new Objects();
        System.out.println("hello");

    }
}
