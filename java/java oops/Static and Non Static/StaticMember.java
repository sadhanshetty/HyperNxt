public class StaticMember {
    static int s = 30;
    int a =40;
    public static void main(String[] args) {
        System.out.println(s);
       // System.out.println(a);  //Cannot make a static reference to the non-static field a
     
        StaticMember s = new StaticMember();
        System.out.println(s.a);
    }
}
