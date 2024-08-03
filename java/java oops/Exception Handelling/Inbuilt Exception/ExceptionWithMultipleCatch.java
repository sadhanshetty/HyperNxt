class Test{
    void divide(int a,int b){
        try{
           
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        try{
            int arr[] = {1,2};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("cannot access the array");
        }
        
    }
}
public class ExceptionWithMultipleCatch {
    public static void main(String[] args) {
        Test t = new Test();
        t.divide(5, 0);
    }
}
