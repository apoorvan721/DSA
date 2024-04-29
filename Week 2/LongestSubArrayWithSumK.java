import java.util.HashMap;

class Sol {

    // Function for finding maximum and value pair
    public int lenOfLongSubarr(int A[], int N, int K) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int prefix_sum = 0;
        int maxlen = 0;
        for (int i = 0; i < N; i++) {
            prefix_sum += A[i];

            if (prefix_sum == K) {
                maxlen = i + 1;
            }
            if (hMap.containsKey(prefix_sum - K)) {
                maxlen = Math.max(maxlen, i - hMap.get(prefix_sum - K));
            }
            if (!hMap.containsKey(prefix_sum)) {
                hMap.put(prefix_sum, i);
            }
        }
        return maxlen;
    }

}

class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int K = 3;
        int N = 10;
        Sol s = new Sol();
        int output = s.lenOfLongSubarr(A, N, K);
        System.out.print(output);
    }
}
