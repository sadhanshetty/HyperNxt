class WPWORT{
    int y;
    void demo3(int x){
        y =x;
        System.out.println(y);
    }
}
public class WithParaWithoutReturnTypeEx1 {
    public static void main(String[] args) {
        WPWORT w2 = new WPWORT();
        w2.demo3(5);
    }
}
