public class TechNumber {
    public static void main(String[] args) {
        int num =2025;
        int t1 = num%100;
        int t2 =num/100; 
        int sum = (int)Math.pow((t1+t2), 2);
        if(sum==num){
            System.out.println(num+" is a Tech number");
        }
        else{
            System.out.println(num+" is not a Tech number");
        }
    }
    
}
