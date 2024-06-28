import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFibo {

    public static void main(String[] args) {
        int n=12;
       List<Long> fiboSeries= Stream.iterate(new long[] {0,1}, fib->
                new long[]{fib[1],fib[0]+fib[1]})
                .limit(n)
                .map(fib->fib[0])
                .collect(Collectors.toList());

       System.out.println(fiboSeries);


    }
}
