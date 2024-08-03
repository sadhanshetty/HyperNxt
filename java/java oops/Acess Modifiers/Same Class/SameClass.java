class WithinClass{
    public int a =10;
    protected int b =20;
    int c =30;
    private int d = 40;
    void disp(){
        System.out.println("public : "+a);
        System.out.println("protected : "+b);
        System.out.println("default : "+c);
        System.out.println("private : "+d);
    }
}
public class SameClass {
    public static void main(String[] args) {
        WithinClass w = new WithinClass();
        w.disp();
    }
}