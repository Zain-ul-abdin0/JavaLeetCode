public class RepeatedString {
    public static void main(String[] args){
        System.out.println(repeatedString("ababa"));
    }
    public static String repeatedString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
