import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {


    public static void main(String[] args) {
        String s="Java is programming langauge";
        reverseString(s);
    }
    public static String reverseString(String s){
        return Arrays.stream(s.split("\\s"))
                .map(rev->reverseWord(s)).collect(Collectors.joining(""));
    }
    public static String reverseWord(String s){
        String str[]=s.split("\\s");

        for(int i=0;i<str.length;i++){
            str[i]=reverse(str[i]);


        }
        return String.join("" ,str);
    }

    public static String reverse(String word){
        char[] ch=word.toCharArray();
        int left=0;
        int right=ch.length-1;

        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
           ch[right]=temp;
           left++;
           right--;
        }
        return new String(ch);
    }

}
