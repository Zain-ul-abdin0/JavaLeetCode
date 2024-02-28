import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args){
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10,2,-5})));
    }
    public static int[] asteroidCollision(int[] asteroids) {

        int index = -1;
        for (int currentAsteroid : asteroids) {

            boolean currentAsteroidIsUndestroyed = true;
            while (currentAsteroidIsUndestroyed && index >= 0 && asteroids[index] > 0 && currentAsteroid < 0) {
                currentAsteroidIsUndestroyed = currentAsteroid + asteroids[index] < 0;
                if (currentAsteroid + asteroids[index] <= 0) {
                    --index;
                }
            }
            if (currentAsteroidIsUndestroyed) {
                asteroids[++index] = currentAsteroid;
            }
        }

        return Arrays.copyOfRange(asteroids, 0, index + 1);
    }
}
