class methods{
    void display(int a){
        System.out.println("displaying int "+a);
    }
    void display(int a, double b){
        System.out.println("dispalying int and double "+a+" "+b);
    }
    void display(double a){
        System.out.println("displaying double "+a);
    }
    void display(double a , int b){
        System.out.println("displaying double and int "+a+" "+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        methods e = new methods();
        e.display(5.5);
        e.display(4,5.5);
        e.display(4);
        e.display(5.5,4);
    }
    
}
