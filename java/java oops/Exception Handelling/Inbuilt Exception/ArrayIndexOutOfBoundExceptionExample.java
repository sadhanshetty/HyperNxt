import java.util.Scanner;

public class ArrayOutOfIndexBoundExceptionExample {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the index of the array ");
        int n = scan.nextInt();  
       try{
        System.out.println( "the array element is "+arr[n]);
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("no way you are finding this task difficult, now enter the index from 0 to "+arr.length);
       } 
       scan.close(); 
    }
    
}
