interface Infosys{
    void disp();
}

interface Infosys2 {
    void show();
}

class Classic implements Infosys,Infosys2{
    public void disp(){
        System.out.println("displaying");
    }
    public void show(){
        System.out.println("showing");
    }
}
public class MultipleInheritanceInterface {
    public static void main(String[] args) {
       Classic c = new Classic();
       c.disp();
       c.show(); 
    }
   
}
