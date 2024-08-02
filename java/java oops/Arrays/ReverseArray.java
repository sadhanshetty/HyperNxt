public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int newarr[]= new int[5];
        int j = 0;;
        for(int i=arr.length-1; i>=0;i--){
            newarr[j] = arr[i];
            j++;
        }
        for(int value:newarr){
            System.out.print(value+",");
        }
    }
}
