package Finished;

//string remove one letter and return palindrome
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "toohottodhoot";
        str = str.toLowerCase();
        System.out.println(str);
        int start = 0;
        int end = str.length() - 1;
        int remove = -1;

        while (start < end) {
            if(end-start < 2){
                if(check(str, start,end)){
                    System.out.println("It is a Palindrome");
                }
            }
            if(check(str, start, end)){
                start++;
                end--;
            }else{
                if(isPalindrome(str,start+1, end)){
                    remove = start;
                    start = end+1;
                }
                if(isPalindrome(str,start, end-1)){
                    remove = end;
                    start = end+1;
                }else{
                    start = end+1;
                }
            }
        }
        if(remove>-1){
            System.out.println("Palindrome if you remove "+str.charAt(remove)+" at index "+ remove);
        }else{
            System.out.println("Not a valid string to make a palindrome");
        }

    }
    static boolean check(String str, int a, int b){
        if(str.charAt(a) == str.charAt(b)){
            return true;
        }
        return false;
    }
    static boolean isPalindrome(String str, int a, int b){
        while(a<b){
            if(str.charAt(a)!=str.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

}
