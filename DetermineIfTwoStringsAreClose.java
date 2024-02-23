import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args){
        System.out.println(closeStrings( "cabbba", "abbccc"));
    }
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        // Count character frequencies in both words
        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
        }

        // Check if the set of character frequencies is the same
        Set<Integer> freqSet1 = new HashSet<>(freqMap1.values());
        Set<Integer> freqSet2 = new HashSet<>(freqMap2.values());

        return freqSet1.equals(freqSet2) && freqMap1.keySet().equals(freqMap2.keySet());

    }
}
