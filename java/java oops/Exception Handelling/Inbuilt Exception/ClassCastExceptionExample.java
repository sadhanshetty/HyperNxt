class ClassA{
    void disp(){
        System.out.println("inside class A");
    }
}
class ClassB extends ClassA{
    void disp(){
        System.out.println("inside class B");
    }
}

class ClassC extends ClassA{
    void disp(){
        System.out.println("inside class C");
    }
}
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        try{
            ClassC c = (ClassC)a;
        }
        catch(ClassCastException e){
            System.out.println("CANNOT DOWNCAST WITHOUT UPCASTING  : "+e);
        }

    }
}
