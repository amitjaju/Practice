//import java.util.Arrays;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//public class CountingOccurance {
//    public static void main(String[] args) {
//        //aa, bb, cc, aa, ee
//         //aa, aa, bb, cc, aa
//         String str="this is java";
//
//      Map<Character,Long> map= Arrays.stream(str.split("//s"))
//                .collect(Collectors.groupingBy(Function.identity(),
//                        new::LinkendHashMap, Collector.counting()));
//        .Map.Entry(k,v).stream().filter(e->e.getValue()>1).map(i->i.getKey()).collect()
//    }
//}
//select