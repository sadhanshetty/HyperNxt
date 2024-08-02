class Superrr{
void dispy(){
    System.out.println("superrrr");
}
}
class Subbb1 extends Superrr{
    void dispy(){
        System.out.println("subbbb1");
    }
}
class Subbb2 extends Superrr{
    void dispy(){
        System.out.println("subbbb2");
    }
}
public class Generalization {
    public static void main(String[] args) {
        Superrr s = new Subbb1();
        s.dispy();
        s = new Subbb2();
        s.dispy();
    }
}
