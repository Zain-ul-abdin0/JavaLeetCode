import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args){
        System.out.println(reverseWords("a good   example"));
    }
//    public static String reverseWords(String s) {
//        String[] chars = s.split(" ");
//        Stack<String> words = new Stack<>();
//        for(int i=chars.length-1; i>=0; i--){
//            words.push(chars[i]);
//        }
//        for(String str : words){
//            System.out.println(str);
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String element : words) {
//            stringBuilder.append(element).append(" ");
//        }
//
//        return stringBuilder.toString().trim();
//    }
//public static String reverseWords(String s) {
//    // Split the input string into words, removing consecutive spaces
//    String[] words = s.split("\\s+");
//
//    // Use a stack to reverse the order of words
//    Stack<String> stack = new Stack<>();
//    for (String word : words) {
//        stack.push(word);
//    }
//
//    // Pop words from the stack and build the reversed string
//    List<String> reversedWords = new ArrayList<>();
//    while (!stack.isEmpty()) {
//        reversedWords.add(stack.pop());
//    }
//
//    // Join the reversed words with spaces
//    return String.join(" ", reversedWords);
//}
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int i= 0, j= arr.length-1;
        while (i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return String.join(" ", arr);
    }

}
