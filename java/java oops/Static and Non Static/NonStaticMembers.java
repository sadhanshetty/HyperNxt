class NonStatic{
  int x =30;
    }

public class NonStaticMembers {
    public static void main(String[] args) {
        NonStatic n = new NonStatic();
        System.out.println(n.x);
    }
}
