public class ReverseString {
    public static void main(String[] args) {
        String s = "Bangalore";
        System.out.println("the original string is "+s);
        String revString="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            revString = ch+revString;
        }
        System.out.println("the reversed string is "+revString);

    }
}
