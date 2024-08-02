public class DuckNum {
    public static void main(String[] args) {
        int num =101;
        int temp = num;
        Boolean test = false;
        while(temp!=0){
            int r = temp%10;
            if(r==0){
                test=true;
            }
            temp=(temp/10);  
        }
        if(test==true){
            System.out.println(num+" is a Duck num");
        }
        else{
            System.out.println(num+" is not a duck num");
        }
    }
}
