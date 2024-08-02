class VTU{
    void disp(){
        System.out.println("this is vtu");
    }
}
class GECM extends VTU{
    void disp(){
        System.out.println("this is GECM");
    }
}
class GECH extends VTU{
    void disp(){
        System.out.println("this is GECH");
    }
}
public class InstanceOfExample {
    public static void main(String[] args) {
        VTU v = new GECM();

        if(v instanceof GECM){
            v.disp();
        }
        else if(v instanceof GECH){
            v.disp();
        }
    }
}
