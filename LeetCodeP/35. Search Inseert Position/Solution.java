class Solution {
    public static int searchInsert(int[] nums, int target) {

        int i;

        for( i=0; i<nums.length; i++){
            if(nums[i] == target){
                i++;
            } else if(nums[i] != target){
                if(nums[i] > target){
                    return i+1;
                }
            }
        }

        return i;

    }

    public static void main(String [] args){
        int [] arr = {1,3,5,6};

        searchInsert(arr,4);

        System.out.println(searchInsert(arr,4));


    }
}
