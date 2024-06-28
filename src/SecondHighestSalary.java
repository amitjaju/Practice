public class SecondHighestSalary {
    //two int arrays, example  arr1 = [1,2,3] , arr2 = [4,8,2]

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 3};
        int [] arr2 = {4, 8, 2};
        int [] arr3=new int[3];
        int temp=0;
        int sum=0;
        int c=0;
        for(int i=0;i<arr1.length;i++) {

                sum= arr1[i]+arr2[i]+temp;
                if(sum<9) {
                    arr3[c]=sum;

                }else{
                    arr3[c]=sum%10;
                    temp=sum/10;


                }
                c++;

        }
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr3[i]);
        }
    }



}
