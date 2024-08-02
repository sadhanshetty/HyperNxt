interface Infy1{
    void disp();
}

class Classy implements Infy1{
    public void disp(){
        System.out.println("creating implementation");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Classy c = new Classy();
        c.disp();
    }
}
