class Example{
    int a;
    int b;
    Example(){
        a=20;
        b=25;
        System.out.println(a+","+b);
    }
    Example(int a){
        this();
        a+=b;
        System.out.println(a+","+b);
    }
}
public class Constructor {
    public static void main(String[] args) {
        new Example(4);
    }
    
}
