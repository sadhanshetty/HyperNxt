class Parent{
    void eat(){
        System.out.println("eating");

    }
}
class Child1 extends Parent{
    void drink(){
        System.out.println("drinking");
    }

}
class Child2 extends Parent{
    void dance(){
        System.out.println("dancing");
    }

}
class Child3 extends Child2{
    void sing(){
        System.out.println("singing");
    }

}
public class HybridInheritance {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.sing();
        c.dance();
        //c.drink();  //error because child3 doesnot inherit from child1
        c.eat();
    }
    
}
