class Solution {
    public static int removeDuplicates(int[] nums) {

            int k=1;


            for(int i =0; i<nums.length ; i++){
                if(nums[i] != nums[i-1]){
                    nums[k]=nums[i];
                    k++;
                }

            }

        return k;


    }

    public static void main(String [] args){

        int arr[] = {1,1,2};
         removeDuplicates(arr);
    }
}
