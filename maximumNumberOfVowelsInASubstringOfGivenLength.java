public class maximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args){
        System.out.println(maxVowels("abciiidef",3));
    }
    public static boolean isVowel(char character){
        switch(character){
            case('a'), ('e'), ('i'), ('o'), ('u'):
                return true;
        }
        return false;
    }
    public static int maxVowels(String s, int k) {
        int numberOfVowels = 0;
        int ans=0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                numberOfVowels++;
            }
        }
        ans = numberOfVowels;
        for (int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                numberOfVowels++;
            }if(isVowel(s.charAt(i-k))){
                numberOfVowels--;
            }
            ans = Math.max(ans,numberOfVowels);
        }
        return ans;
    }

}
