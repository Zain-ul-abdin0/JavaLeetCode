public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static void main(String[] args){
        System.out.println(longestSubarray(new int[]{1,1,0,1}));
    }
    public static int longestSubarray(int[] nums) {
        int ans = 0;

        int i = 0;

        int j = -1;

        int count = 0;

        while(i<nums.length){
            //acquire

            if (nums[i]==1){
                i++;
            }else{
                i++;
                count++;
            }
            while (count>1 && j<i){
                j++;
                if(nums[j] == 0){
                    count--;
                }
            }
ans=Math.max(ans,i-j-1);
        }
return ans-1;
    }
}
