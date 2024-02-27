import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args){
        System.out.println(Arrays.toString(asteroidCollision(new int[]{8,-8})));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        int check = 0;
        ArrayList<Integer> asteroidList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<asteroids.length; i++) {
            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
            }else if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else if(asteroids[i]<0){
                for(int j = stack.size()-1; j>=0; j--) {
                    check = Math.abs(stack.peek());
                    if(stack.get(j)>check){
                        stack.pop();
                    }else if(stack.get(j)-check==0){
                        stack.pop();
                    }
                }
            }
        }
        asteroidList.addAll(stack);

        return asteroidList.stream().mapToInt(Integer::intValue).toArray();
    }
}
