public class Power {
    public static void main(String[] args){
        System.out.println(calculatePower(2,3));
    }
    public static int calculatePower(int base, int power){
        int result = 1;
        for(int i =0; i<power; i++){
            result = result * base;
        }
        return result;
    }
}
