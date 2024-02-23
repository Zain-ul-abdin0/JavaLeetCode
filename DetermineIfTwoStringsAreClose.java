import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args){
        System.out.println(closeStrings( "cabbba", "abbccc"));
    }
    public static boolean closeStrings(String word1, String word2) {

        if(word1.length()==word2.length()){

            char[] charArray = word1.toCharArray();
            char[] charArray1 = word2.toCharArray();

            // Sort the char array
            Arrays.sort(charArray);
            Arrays.sort(charArray1);

            // Create a new string from the sorted array
            String sortedString = new String(charArray);
            String sortedString2 = new String(charArray1);

            Set<String> set1 = new HashSet<>(Arrays.asList(sortedString));
            Set<String> set2 = new HashSet<>(Arrays.asList(sortedString2));

            if(set1.equals(set2)){
                return true;
            }

        }
        else{
            return false;
        }
        return false;
    }
}
