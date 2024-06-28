import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWord {

    public static void main(String[] args) {

        String [] list= Arrays.asList("Java", "Spring", "JPA", "Java", "Cloud", "JPA").toArray(new String[0]);
        Map<String,Long> dup= Arrays.stream(list).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                        dup.entrySet().stream().filter(e->e.getValue()>1)
                                .forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
        }
    }

