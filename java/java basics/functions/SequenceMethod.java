public class SequenceMethod {
     int val;
    void addition(int val){
        this.val = val+50;
        System.out.println("the addition is "+this.val);
    }
    void substraction(int val){
        this.val = val-10;
        System.out.println("the substraction is "+this.val);
    }
    void multiplication(int val){
        this.val = val*2;
        System.out.println("the multiplication is "+this.val);
    }


    public static void main(String[] args) {
        SequenceMethod h1 = new SequenceMethod();
        h1.addition(10);;
        h1.substraction(5);
        h1.multiplication(2);

    }
}
