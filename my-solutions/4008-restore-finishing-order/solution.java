import java.util.Arrays;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        int k = 0;
        for (int i = 0; i <=order.length-1; i++) {
            for (int j = 0; j <=friends.length-1; j++) {
                if (order[i] == friends[j]) {
                    arr[k++] = order[i];
                    break;
                }
            }
        }
        return arr;
    }
}

