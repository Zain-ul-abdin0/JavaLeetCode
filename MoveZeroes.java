public class MoveZeroes {
    public static void main(String[] args){
        int[] input = new int[] {0,1,0,3,12};
        for (int i=0; i<input.length-1; i++){
            int j=i;
            while (j<input.length-1 && input[j+1]<=0){
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    j++;
            }
        }
        for(int i=0; i<input.length;i++ ){
            System.out.println(input[i]);
        }
    }
}
