import demoPackage.DemoClass1;
class DemoClass2{
    DemoClass1 d = new DemoClass1();
    void disp(){
        System.out.println("public : "+d.a);
        // System.out.println("protected : "+d.b); //The protected field b is not visible
        // System.out.println("default : "+d.c);   //The default field c is not visible
        // System.out.println("private : "+d.d);   //The private field d is not visible
    }
}
public class DifferentPackageNonSubClass{
    public static void main(String[] args) {
        DemoClass2 d2 = new DemoClass2();
        d2.disp();
    }
}