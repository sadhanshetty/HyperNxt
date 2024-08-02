public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 1634;
        int temp = num;
        int count =0;
        int sum =0;
        while(temp!=0){
            temp=temp/10;
            count++;
            }
        temp=num;
        while(temp!=0){
            int r = temp%10;
            sum =sum+(int)(Math.pow(r,count));
            temp=temp/10;
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num+" is not an armstrong number");
        }
    }
    
}
