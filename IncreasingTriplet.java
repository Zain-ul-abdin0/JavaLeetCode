import java.util.ArrayList;
import java.util.List;

public class IncreasingTriplet {
    public static void main(String[] args){
        System.out.println(increasingTriplet(new int[]{1,6,2,5,1}));
    }
    public static boolean increasingTriplet(int[] nums) {
        int i =Integer.MAX_VALUE;
        int j =Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= i) i = n;
            else if(n <=j) j = n;
            else return true;
        }
        return false;

    }
}
