class Accountss{
    private static Accountss a;
    private  Accountss(){
        System.out.println("somethinhgggggg");
    }
    public static Accountss CreateObject(){ //public static helper method
        if(a==null){
          return a = new Accountss();
        }
        else{
            System.out.println("object already exits");
            return a;
        }
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Accountss.CreateObject();
        Accountss.CreateObject();
        Accountss.CreateObject();
        
        
    }
}
