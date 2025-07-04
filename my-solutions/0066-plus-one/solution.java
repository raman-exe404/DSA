import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

        // Use ArrayList to store result
        ArrayList<Integer> list = new ArrayList<>();

        // Start from last digit and add one
        int carry = 1; // This is the "+1"
        for (int i = len - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            list.add(sum % 10);
            carry = sum / 10;
        }

        // If carry is still left (e.g., 999 -> 1000)
        if (carry != 0) {
            list.add(carry);
        }

        // Reverse the list to correct order
        int[] result = new int[list.size()];
        for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
            result[j] = list.get(i);
        }

        return result;
    }
}

