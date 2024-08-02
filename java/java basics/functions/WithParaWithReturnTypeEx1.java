class WPWRT{
    int y;
    int demo5(int a){
        y=a+5;
        return y;
    }
}
public class WithParaWithReturnTypeEx1 {
    public static void main(String[] args) {
        WPWRT ww = new WPWRT();
       int s= ww.demo5(5);
        System.out.println(s);
    }
}
