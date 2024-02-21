public class IsSubsequence {
    public static void main(String[] args){
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {

        char[] c = t.toCharArray();
        char[] c1 = s.toCharArray();
        int result = s.length();
        int count = 0;
        for(int i = 0; i < c1.length; i++){
            for(int j = 0; j < c.length; j++){
                if(c1[i] == c[j]){
                    count++;
                }
            }
        }

        if(result==count) return true;
        return false;
    }
}
