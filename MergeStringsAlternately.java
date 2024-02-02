import java.util.LinkedList;
import java.util.Queue;

public interface MergeStringsAlternately {
    public static void main(String[] args){
        System.out.println(mergeAlternately("abc", "pqrz"));
    }
    public static String mergeAlternately(String word1, String word2) {
        String toAppend = "";
        String big;
        char[] string1 = word1.toCharArray();
        char[] string2 = word2.toCharArray();
        big = word1.length()>word2.length()?word1 : word2;
        int lenthofString1 = word1.length()-1;
        int lenthofString2 = word2.length()-1;
        int minValue = Math.min(lenthofString1, lenthofString2);
        StringBuilder result = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        toAppend =  big.substring(minValue+1);
        for(int i = 0; i<=minValue ; i++){
            queue.add((string1[i]));
            queue.add((string2[i]));
        }
        for(Character c : queue){
            result.append(c);
        }
        result.append(toAppend);
        return result.toString();
    }
}
