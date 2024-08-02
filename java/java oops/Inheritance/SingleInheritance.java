class Parent{
    int a;
    int b;
    Parent(){
       a=10; 
       b=20;
    }
}
class child extends Parent{
    int c;
    int d;
    child(){
        c =30;
        d=40;
    }
    void display(){
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.display();
        
    }
    
}
