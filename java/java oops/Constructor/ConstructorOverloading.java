class Abc{
    Abc(){
        System.out.println("this is a non parametrized constructor");
    }
    Abc(int a){
        System.out.println("this is a integer parameterized constructor : "+a);
    }
    Abc(String name){
        System.out.println("this is a string parameterized constructor : "+name);
    }
    Abc(Double dub){
        System.out.println("this is a double parameterized constructor : "+dub);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
    new Abc();
    new Abc(5.5);
    new Abc("sadhan");
    new  Abc(5);
      
        
    }
    
    
}
