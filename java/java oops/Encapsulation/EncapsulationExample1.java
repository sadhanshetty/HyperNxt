class Encapse{
    private int salary;
    private int id;
    private String name;
    public Encapse(int salary,int id, String name){
        this.id = id;
        this.salary= salary;
        this.name = name;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setSalary(int salary){
        this.salary= salary;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }       
}
public class EncapsulationExample1 {
    public static void main(String[] args) {
        Encapse enc = new Encapse(1000,001,"sadhan");
        System.out.println(enc.getId());
        System.out.println(enc.getName());
        System.out.println(enc.getSalary());
        
    }
    
}
