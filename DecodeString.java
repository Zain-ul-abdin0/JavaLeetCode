import java.util.Stack;

public class DecodeString {
    public static void main(String[] args){
        System.out.println(decodeString("3[a]2[bc]"));
    }
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                // Pop characters until '[' is encountered
                StringBuilder decodedSubstring = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    decodedSubstring.insert(0, stack.pop());
                }
                stack.pop(); // Remove '['

                // Extract the multiplier
                StringBuilder countStr = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    countStr.insert(0, stack.pop());
                }
                int count = Integer.parseInt(countStr.toString());

                // Repeat the decoded substring and push it back to the stack
                String repeatedSubstring = decodedSubstring.toString().repeat(count);
                for (char repeatedChar : repeatedSubstring.toCharArray()) {
                    stack.push(repeatedChar);
                }
            }
        }

        // Build the final result from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
