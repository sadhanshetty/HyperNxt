class Aaaa{
    public void show(){
        System.out.println("i am sadhan");
    }
    public void show1(){
        System.out.println("hi");
    }
}
class Bbbb extends Aaaa{
    public void show(){
        System.out.println("i am batman"); // overriding show method
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Aaaa ab = new Bbbb();
        ab.show();
        ab.show1();
    }
    
}
