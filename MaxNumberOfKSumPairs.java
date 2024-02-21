import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args){
        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;
        int cnt=0;
        while(i<j){
            if(nums[i]+nums[j]==k){
                cnt++; i++; j--;
            }
            else if(nums[i]+nums[j] < k){
                i++;
            }
            else j--;
        }
        return cnt;

    }
}
