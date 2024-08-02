class WithReturnType{
    int a =10;
    int demos(){
        return a;
    }
}
public class WithoutParaWithReturnTypeEx1 {
    public static void main(String[] args) {
        WithReturnType w = new WithReturnType();
        int x= w.demos();
        System.out.println(x);
    }
    
}
