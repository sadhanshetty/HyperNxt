class A {
    int abc;
    String name;
    A(){
        this(20);
        System.out.println("this is inside class a contructor");
    }
    A(int a){
        abc= a;
        System.out.println("This is a parameterized constructor "+abc);
    }
    A(String a){
        this();
        name = a;
        System.out.println("this is a string parameterised constructor"+name);
    }
}
class B extends A{
    
    int a;
    String add;
    B(){
       System.out.println("THIS IS INSIDE CLASS B CONSTRUCTOR"); 
    }
    B(int a){
        this();
        this.a=a;
        System.out.println("THIS IS INSIDE PARAMETERIZED CLASS B CONSTRUCTOR"+a);
    }
    B(String a){
        this(1);
        add =a;
        System.out.println("this is inside B string parametrized Constructor "+add);
        
    }
} 
public class ChainingConstructor {
    public static void main(String[] args) {
        new B("shetty");
        
    }
}
