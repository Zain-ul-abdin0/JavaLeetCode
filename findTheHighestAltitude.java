public class findTheHighestAltitude {
    public static void main(String[] args){
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
    public static int largestAltitude(int[] gain) {
        int result = 0 ;
        int temp = 0 ;
        for(int i=0; i<gain.length;i++){
            temp = temp + gain[i];
            if(temp>result){
                result = temp;
            }
        }
        return result;
    }
}
