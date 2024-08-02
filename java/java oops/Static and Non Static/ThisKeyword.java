class TestExample{
    int a=33;
    void testdisp(int a){
        System.out.println(a); // this is a local variable
        System.out.println(this.a); //this is an instance variable
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        TestExample t = new TestExample();
        t.testdisp(55);
    }
    
}
