public class MaximumAverageSubarrayI {
    public static void main(String[] args){
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double result = 0;
        for(int i=0; i<k; i++){
            result = result + nums[i];
        }
        double maxSum = result;
        int endIndex =k ;
        int startIndex =0;
        while (endIndex<nums.length){
        result = result - nums[startIndex];
        startIndex++;

        result += nums[endIndex];
        endIndex++;

        maxSum= Math.max(result,maxSum);
        }
        return (double) maxSum/k;
    }
}
