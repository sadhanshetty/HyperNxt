import TestPacakge1.TestClass1;
class TestClass2 extends TestClass1{
    void disp(){
        System.out.println("public : "+a);
        System.out.println("protected : "+b);
        // System.out.println("default : "+c); //The private field c is not visible
        // System.out.println("private : "+d); //The private field d is not visible
    }
}
public class DifferentPackageSubClass{
    public static void main(String[] args) {
        TestClass2 t = new TestClass2();
        t.disp();
    }
}