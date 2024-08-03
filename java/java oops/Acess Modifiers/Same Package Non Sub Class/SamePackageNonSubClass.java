class TestClass1{
    public int a =10;
    protected int b =20;
    int c =30;
    private int d = 40;
}

class TestClass2{
    TestClass1 t = new TestClass1();
    void disp(){
        System.out.println("public : "+t.a);
        System.out.println("protected : "+t.b);
        System.out.println("default : "+t.c);
        // System.out.println("private : "+t.d); //The private field d is not visible
    }
}
public class SamePackageNonSubClass{
    public static void main(String[] args) {
        TestClass2 t2 = new TestClass2();
        t2.disp();
    }
}