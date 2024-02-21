public class containerWithMostWater {
    public static void main(String[] args){
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
    public static int maxArea(int[] height) {
        int water = 0, left = 0 , right = height.length-1;

        while(left < right){
            water = Math.max(water, Math.min(height[left], height[right])*(right-left));
            if(height[left]>height[right]) right--;
            else left++;
        }
    return water;
    }
}
