class Facto{
    int fac =1;
    int dummy =0;
    int fact(int n){
       do{
           fac=fac*n; 
            n--;
        }
        while(n>=1);
        dummy=fac;
        fac=1;
        return dummy;
    }
}
public class KrishnamurthyNumber {
    public static void main(String[] args) {
        int num =145;
        int temp =num;
        int sum=0;
        Facto f= new Facto();
        while(temp!=0){
            int r = temp%10;
           sum=sum+ f.fact(r);
           temp= temp/10;
        }
        if(sum==num){
            System.out.println(num+" is a Krishnamurthy number");
        }
        else{
            System.out.println(num+" is not a krishnamurthy number");
        }
    }
    
}
