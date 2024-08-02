public class LogicalOperators {
    public static void main(String[] args) {
        Boolean a = true;
        boolean b = false;
        
        System.out.println("a AND a is " +(a&&a));
        System.out.println("a AND b is " +(a&&b));
        System.out.println("b AND b is " +(b&&b));

        System.out.println("a OR a is " +(a||a));
        System.out.println("a OR b is " +(a||b));
        System.out.println("b OR b is " +(b||b));

        System.out.println("a xOR a is " +(a^a));
        System.out.println("a xOR b is " +(a^b));
        System.out.println("b xOR b is " +(b^b));

        System.out.println("NOT of a is "+(!a));
        System.out.println("NOT of b is "+(!b));
       
    }
}
