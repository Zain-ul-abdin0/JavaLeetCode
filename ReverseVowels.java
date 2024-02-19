import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args){
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');

        int left = 0 ;
        int right = s.length()-1;
        char[] characters = s.toCharArray();
        char temp;
        while(left<right){
            if(vowels.contains(characters[left])) {
                if(vowels.contains(characters[right])){
                  temp = characters[right];
                  characters[right] =characters[left];
                  characters[left]= temp;
                  right--;
                  left++;
                }else{
                    right--;
                }
            }else {
                left++;
            }
        }
        return s=String.valueOf(characters);
    }
}
