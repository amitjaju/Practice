//Shift negative elements to the left of the array
//int[] array = {4,-3,8,9,-1,5,2,-10,-11,45};
//expected output: {-3,-1,-10,-11,4,8,9,5,2,45};

  //      1. don't sort the array
    //    2. don't declare new array or collections
      //  3. don't use any library function

public class HarmanTest {
    public static void main(String[] args) {
        FunctionalInterface in=()->System.out.println("Hello functional ");
        in.myMethodTest();
        int arr[]={4,-3,8,9,-1,5,2,-10,-11,45};
        shiftNegativeLeft(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] arr1 = {4,7,9,11};
        int[] arr2 = {1,2,5,8,9,10};
        mergeArray(arr1,arr2);
    }
    public static void shiftNegativeLeft(int arr[]){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            if(arr[left]<0){
                left++;
            }else if(arr[right]>=0){
                right--;
            }else {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    //int[] arr1 = {4,7,9,11};
    //	int[] arr2 = {1,2,5,8,9,10};
    //	merge the above sorted arrays into a third array in a sorted manner;
    public static int [] mergeArray(int arr1[],int arr2[])
    {
        int lenarr1=arr1.length;
        int lenarr2=arr2.length;
        int mergeArray[] =new int[lenarr1+lenarr2];
        int i=0,j=0,k=0;
        while(i<lenarr1 && j< lenarr2){
            if(arr1[i]<arr2[j]){
                mergeArray[k++]=arr1[i++];
            }else{
                mergeArray[k++]=arr2[j++];
            }
        }

        while(i<lenarr1){
            mergeArray[k++]=arr1[i++];
        }

        while(j<lenarr2){
            mergeArray[k++]=arr1[j++];
        }
        return mergeArray;
    }
}
@java.lang.FunctionalInterface
interface FunctionalInterface{
    void myMethodTest();
}


