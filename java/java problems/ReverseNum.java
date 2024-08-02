public class ReverseNum {
    public static void main(String[] args) {
        int num = 123456;
        int temp = num;
        int rev=0;
        while(num>0){
            temp = num%10;
            rev =rev*10;
            rev =rev+ temp;
            num=num/10;
        }
        System.out.println(rev);
        }
    }

