class Animals{
    public String toString(){
        return "cat";
    }
}
public class ToStringMethod {
    public static void main(String[] args) {
        Animals cat = new Animals();
        System.out.println(cat); //default calls tostring method
    }
}
