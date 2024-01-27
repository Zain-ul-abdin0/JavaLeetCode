public class MaximizingElementConstraint {
    public static void main(String[] args) {
        System.out.println(maxElement(3, 6, 1));
    }

    public static int maxElement(int n, int maxSum, int k) {
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            sum += arr[i];
        }

        while (sum < maxSum && arr[k] < maxSum - sum) {
            arr[k] = arr[k] + 1;
            sum = 0;

            for (int a : arr) {
                sum += a;
            }
        }

        return arr[k];
    }
}
