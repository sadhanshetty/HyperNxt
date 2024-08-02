class Father{
    int a =10;
}

class Son extends Father{
    int b=20;
}
public class Upcasting {
    public static void main(String[] args) {
        Father f = new Son(); //super class reference sub calss object
        System.out.println(f.a);
        //System.out.println(f.b);
    }
    
}
