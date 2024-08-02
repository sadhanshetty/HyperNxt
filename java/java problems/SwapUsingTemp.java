public class SwapUsingTemp {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        int temp = 0;
        System.out.println("before swaping a = "+a+" and b = "+b);
        temp = a;
        a= b;
        b= temp;
        System.out.println("after swaping a = "+a+" and b = "+b);
        }
}
