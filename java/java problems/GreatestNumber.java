public class GreatestNumber {
    public static void main(String[] args) {
        int a = 35;
        int b = 100;
        int c = 25;
        if(a>b&&a>c){
            System.out.println(a+" is the greatest number than "+b+" and "+c);
        }
        else if(b>c){
            System.out.println(b+" is the greatest number than "+a+" and "+c);
        }
        else{
            System.out.println(c+" is the greatest number than "+a+" and "+b);
        }
    }
}
