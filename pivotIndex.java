public class pivotIndex {
    public static void main(String[] args){
        System.out.println(pivotIndex(new int[] {2,1,-1}));
    }
    public static int pivotIndex(int[] nums) {
        int temp1 = 0 ;
        int temp2 = 0;
        int result = -1;
        int i;
        for (i = 0; i < nums.length; i++){
            for(int j = nums.length-1; j >i-1; j--){
                temp2 = temp2 + nums[j];
            }
            temp1 = temp1+nums[i];
            if(temp1==temp2){
                result = i;
                return result;
            }
            temp2=0;
        }
        return result;
    }
}
