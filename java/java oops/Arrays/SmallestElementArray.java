public class SmallestElementArray {
    public static void main(String[] args) {
        int arr[]={10,2,3,47,5,6,1,7,8};
        int pivot=arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<pivot){
                pivot = arr[i];
            }
        }
        System.out.println("Smallest number is : "+pivot);
    }
}
