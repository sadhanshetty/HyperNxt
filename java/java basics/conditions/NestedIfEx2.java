public class NestedIfEx2 {
    public static void main(String[] args) {
        int marks =35;
        if(marks==35){
            if(marks>35&marks<=100){
                System.out.println("student has passed in the exam");
            }
        }
        else{
            System.out.println("student has failed in the exam");
        }
    }
}
