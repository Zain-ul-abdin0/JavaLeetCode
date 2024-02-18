public class CanPlaceFlowers {
    public static void main(String[] args){
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1},2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0 ;
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i]==0) {

                boolean leftplot = (i - 1 < 0 || flowerbed[i - 1] == 0);
                boolean rightplot = (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0);

                if (leftplot && rightplot) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count>= n;
    }
}
