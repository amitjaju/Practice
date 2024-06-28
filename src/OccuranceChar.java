import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceChar {
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,9,1};
        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
    String str="java";
//    Map<Character,Integer> map=str.chars().mapToObj(c->(char)c)
//            .collect(Collectors.groupingBy(Function.identity,LinkedHashMap::new,Collectors.counting()));




}

