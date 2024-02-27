import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args){
        System.out.println(removeStars("leet**cod*e"));
    }
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> result = new Stack<Character>();

        for(int i=s.length()-1; i>=0;i--){
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()){
            char popped = stack.pop();  // Pop the element from the stack

            if (!(popped == '*')) {
                result.push(popped);
            }else{
                result.pop();

            }
        }
        StringBuilder result1 = new StringBuilder();

        for (Character element : result) {
            result1.append(element);
        }
        return result1.toString();
    }
}
