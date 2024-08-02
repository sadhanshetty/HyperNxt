public class ChainingMethod {
    static int value;
    public void add(int value){
        this.value =value+10;
        System.out.println(this.value);
        sub(value);
    }
    public void sub(int value){
        this.value =value-2;

        System.out.println(this.value);
    }
    public static void main(String[] args) {
        ChainingMethod sec = new ChainingMethod();
        sec.add(50);
    }
    
}
