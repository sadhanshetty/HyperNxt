public class PalindromeOrNot {
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println("the original string is "+s);
        String revString="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            revString = ch+revString;
        }
        if(revString.equals(s)){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome ");
        }
}
}
