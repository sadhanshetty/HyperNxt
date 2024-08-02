public class GreatestElementArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,47,5,6,7,8};
        int pivot=arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>pivot){
                pivot = arr[i];
            }
        }
        System.out.println("greatest number is : "+pivot);
    }
}
