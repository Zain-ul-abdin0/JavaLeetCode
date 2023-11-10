public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234567899));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }

        long longValue = x;

        char[] charArray = Long.toString(x).toCharArray();
        char[] reversed = new char[charArray.length];
        int temp = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed[temp] = charArray[i];
            temp++;
        }
        long realNumber = Long.parseLong(new String(charArray));
        long reversedNumber = Long.parseLong(new String(reversed));
        if (realNumber == reversedNumber) {
            return true;
        }
        return false;
    }
}
