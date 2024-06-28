import javax.swing.text.NumberFormatter;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class TestClass {
    //Create a function to Convert Large Number to Short Abr Number :

    //IptVar = 10000000	[O] 200000	[O] 3000

   // OptVar = 1 Cr 		[O] 2 L 	[O] 3 K
    public static void main(String[] args) {
        System.out.println("Input Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // Function<Integer,String> numberFormater= NumberFormatter::covertNumber;
       //String formatNumber=numberFormater.apply(n);
        String coverNumberFormater=covertNumber(n);
        System.out.println(coverNumberFormater);
    }

    public static String covertNumber(int n){
        if(n>=1_00_00_000){
            double crores=n/1_00_00_000.0;
//            DecimalFormat format = new DecimalFormat("##.#");
//            format.format(crores);
         return String.format("%.2f Cr",crores);
        }else if(n>=1_00_000){
            double lakhs=n/1_00_000.0;
//            DecimalFormat format = new DecimalFormat("00.#");
//            format.format(lakhs);
            return String.format("%.2f L",lakhs);
        }else if(n>=1_000){
            double thounsand=n/1_000.0;
            return String.format("%.2f K",thounsand);
        }else{
            return String.valueOf(n);
        }

    }
}
