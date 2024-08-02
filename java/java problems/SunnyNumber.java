public class SunnyNumber {
    public static void main(String[] args) {
        int num = 81;
        int temp = num;
        int sum =0;

        while(temp!=0){
            int r =temp%10;
            sum+=r;
            temp=(temp/10);
        }
        if(sum*sum==num){
            System.out.println(num+" is a sunny num");
        }
        else{
            System.out.println(num+" is not a sunny num");
        }
    }
}
