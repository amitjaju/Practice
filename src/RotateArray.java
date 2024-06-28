public class RotateArray {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
         int k = 3;
    rotate(nums,k);
    }
        public static void rotate(int[] nums, int k) {


            System.out.println(reverseArray(nums,0,nums.length-1));
            System.out.println(reverseArray(nums,0,k-1));
            System.out.println(reverseArray(nums,k,nums.length-1));

        }
        public static int[] reverseArray(int[] nums, int l, int r){

            while(l<=r){

                int  temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
            return nums;
        }
    }

