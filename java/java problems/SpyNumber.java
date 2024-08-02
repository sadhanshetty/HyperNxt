public class SpyNumber {
    public static void main(String[] args) {
        int num =1124;
        int temp = num;
        int sum =0;
        int mul=1;
        while(temp!=0){
            int r = temp%10;
            sum+=r;
            mul=mul*r;
            temp=temp/10;
        }
        if(sum==mul){
            System.out.println(num+" is a Spy number");
        }
        else{
            System.out.println(num+" is not a Spy number");
        }
    }
    
}
