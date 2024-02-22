public class MaxConsecutiveOnesiii {
    public static void main(String[] args){
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, window = 0, n = nums.length;
        int ans=0;
        for(right = 0; right < n; right++){
            window = window + nums[right];
            while(window + k< right-left+1){
                window=window +-nums[left];
                left++;
            }
        ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
