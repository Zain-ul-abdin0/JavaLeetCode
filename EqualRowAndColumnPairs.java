import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

    public static void main(String[] args){
        int result = equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}});
        System.out.println(result);
    }
    public static int equalPairs(int[][] grid) {
        int result = 0;
        HashMap<Integer,int[]> rows = new HashMap<>();
        HashMap<Integer,int[]> columns = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            rows.put(i, grid[i]);
        }
        for (int j = 0; j < grid[0].length; j++) {
            int[] column = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                column[i] = grid[i][j];
            }
            columns.put(j, column);
        }
        for(int i =0 ; i < rows.size(); i++){
            for(int j = 0 ; j < columns.size(); j++){
                if(Arrays.toString(rows.get(i)).equals(Arrays.toString(columns.get(j)))){
                    result++;
                }
            }
        }

        return result;
    }
}
