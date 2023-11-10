import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {3,2,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for(int k=0; k<i; k++){
                if((nums[k]+nums[i])  == target ){
                    return  new int[]{k, i};
                }
            }

        }
        return nums;
    }
}
