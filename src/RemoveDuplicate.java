public class RemoveDuplicate {
    public static void main(String[] args) {
        int n[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(n));
    }
    public static int removeDuplicates(int[] nums) {
        int c=0;

        int p=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[c]!=nums[i]){
                nums[++c]=nums[i];
            }

        }
        return c+1;

    }
}
