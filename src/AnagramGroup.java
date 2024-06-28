import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGroup {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};


        Map<String, List<String>> anagrams = Arrays.stream(strs)
                .collect(Collectors.groupingBy(AnagramGroup::sortString));
                System.out.println(anagrams);


            }

    private static String sortString(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

        }


