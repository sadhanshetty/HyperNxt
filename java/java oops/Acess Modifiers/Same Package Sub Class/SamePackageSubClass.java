class SuperClass{
    public int a =10;
    protected int b =20;
    int c =30;
    private int d = 40;
}
class SubClass extends SuperClass{
    void disp(){
        System.out.println("public : "+a);
        System.out.println("protected : "+b);
        System.out.println("default : "+c);
        // System.out.println("private : "+d); //The private field d is not visible
    }
}
public class SamePackageSubClass{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.disp();
    }
}