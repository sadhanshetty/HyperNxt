public class Pattern4 {
    public static void main(String[] args) {
        int count =5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j||count==j){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            count--;
        }
    }
    
}
