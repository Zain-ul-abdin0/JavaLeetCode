import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "X";
        int result = romanToInteger(romanNumeral);
        System.out.println(result);
    }

    public static int romanToInteger(String romanNumeral) {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            int current = romanMap.get(romanNumeral.charAt(i));
            if (i < romanNumeral.length() - 1 && romanMap.get(romanNumeral.charAt(i + 1)) > current) {
                result -= current;
            } else {
                result += current;
            }
        }
        return  result;
    }

}
