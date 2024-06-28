//import java.util.Arrays;
//import java.util.stream.IntStream;
//
//public class TestWipro {
//
//
//    //Input array: 3,4,1,2
//   // Output array:8,6,24,12
//
//    int a[]={3,4,1,2};
//    int length=a.length;
//    int left[]=new int[a.length];
//    int right[]=new int[a.length];
//    int result[]=new int[a.length];
//
//    left[0]=1;
//    IntStream.range(1,length).forEach(i->left[i]=a[i-1]*left[i-1]);
//
//
//    int j=1
