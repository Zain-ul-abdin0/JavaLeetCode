public class compressString {
    public static void main(String[] args){
        System.out.println(compressStringFunction(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
    public static int compressStringFunction(char[] chars){
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        int freq = 1;

        for(int i = 0; i < n; i++){
            char c = chars[i];

            while(i < n-1 && chars[i] == chars[i+1]){
                    freq++;
                    i++;
            }
            sb.append(c);
            if (freq > 1) {
                sb.append(freq);
            }
            freq = 1;
        }
        String s = sb.toString();
        char[] compressed = s.toCharArray();

        for(int i = 0; i < s.length(); i++){
            chars[i] = compressed[i];
        }
        return compressed.length;
    }
}
