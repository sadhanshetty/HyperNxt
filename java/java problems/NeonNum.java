public class NeonNum {
    public static void main(String[] args) {
        int num =9;
        int sqr = num*num;
        int temp =sqr;
        int sum=0;
        while(temp!=0){
            int r =temp%10;
            sum+=r;
            temp=(temp/10);
        }
        if(sum==num){
            System.out.println(num+" is a neon number");
        }
        else{
            System.out.println(num+" is not a neon number");
        }
    }
    
}
