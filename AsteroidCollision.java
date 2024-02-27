import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args){
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5})));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        int temp;
        ArrayList<Integer> asteroidList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<asteroids.length; i++){
            stack.push(asteroids[i]);
        }
        for(int i = asteroids.length-1; i>0; i--){
            if(stack.get(i)+stack.get(i-1)<0){
                temp = Math.max(Math.abs(stack.get(i)),Math.abs(stack.get(i-1)));
                asteroidList.add(temp);
                asteroids[i-1]=temp;

            }

        }
        System.out.println(asteroidList);


        return null;
    }
}
