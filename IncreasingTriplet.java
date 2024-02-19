import java.util.ArrayList;
import java.util.List;

public class IncreasingTriplet {
    public static void main(String[] args){
        System.out.println(increasingTriplet(new int[]{1,6,2,5,1}));
    }
    public static boolean increasingTriplet(int[] nums) {
        int counterCheck = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<nums[i+1]){
                counterCheck++;
            }
            else {
                counterCheck = 0;
            }
        }
        if(counterCheck!=0){
            System.out.println(counterCheck);
            return true;
        }
        System.out.println(counterCheck);
        return false;
    }
}
