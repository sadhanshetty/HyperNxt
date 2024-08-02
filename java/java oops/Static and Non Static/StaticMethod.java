class Student{
    int rollno;
    String name;
    static String college ="GECM";
    
    static void change(){
     college =  "sgce";
      System.out.println(college);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student.change();
       
    }
}
