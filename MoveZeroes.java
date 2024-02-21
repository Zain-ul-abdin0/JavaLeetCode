public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = new int[] {0,1,0,3,12};
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
            }
        }

        for(int i=k;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}

