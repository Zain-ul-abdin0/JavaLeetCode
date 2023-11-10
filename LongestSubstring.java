//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.Map;
//
//public class LongestSubstring {
//    public static void main(String[] args){
//            String str = "pwwkew";
//            boolean skipFlag = false;
//            HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
//            for(int i=0; i<str.length(); i++){
//                for (int j=i+1; j<=str.length(); j++){
//                    String substring = str.substring(i,j);
//                    char[] charTemp = substring.toCharArray();
//                    for(int k=0; k<=substring.length();k++){
//                        for(int z=k+1;z<substring.length();z++){
//                            if(charTemp[k]==charTemp[z]){
//                                skipFlag = true;
//                            }
//                        }
//                    }
//                    //check if string is bigger than the previous one then append
//                    if(hashMap.isEmpty()){
//                        hashMap.put(substring,substring.length());
//                    }
//                    else{
//                        if(!skipFlag){
//                            String maxKey = hashMap.entrySet().stream()
//                                    .max(Comparator.comparing(Map.Entry::getValue))
//                                    .map(Map.Entry::getKey)
//                                    .orElse(null);
//                            int maxValue = hashMap.getOrDefault(maxKey, Integer.MIN_VALUE);
//                            if(maxValue<substring.length()){
//                                hashMap.clear();
//                                hashMap.put(substring,substring.length());
//                            }
//                        }
//
//                    }
//                }
//                System.out.println(hashMap);
//
//            }
//    }
//}


import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                char[] charTemp = substring.toCharArray();

                boolean skipFlag = false; // Reset the skipFlag for each substring

                for (int k = 0; k < substring.length() - 1; k++) {
                    for (int z = k + 1; z < substring.length(); z++) {
                        if (charTemp[k] == charTemp[z]) {
                            skipFlag = true;
                            break; // exit the loop if a duplicate is found
                        }
                    }
                    if (skipFlag) {
                        break; // exit the outer loop if a duplicate is found
                    }
                }

                // Check if string is bigger than the previous one then append
                if (!skipFlag && (hashMap.isEmpty() || substring.length() > hashMap.entrySet().iterator().next().getValue())) {
                    hashMap.clear();
                    hashMap.put(substring, substring.length());
                }
            }
        }
            Collection<Integer> valuesCollection = hashMap.values();

            Integer[] valuesArray = valuesCollection.toArray(new Integer[0]);
            int intValueFromArray = valuesArray[0];
            System.out.print(intValueFromArray);
    }
}
