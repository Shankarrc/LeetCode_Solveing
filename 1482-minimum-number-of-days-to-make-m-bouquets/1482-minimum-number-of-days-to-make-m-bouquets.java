class Solution {
    public boolean check(int arr[], int m, int k, long mid) {
        long cnt = 0;
        long bob = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                cnt++;
                if (cnt == k) {
                    bob++;
                    cnt = 0;
                }
            } else {
                cnt = 0;
            }
        }

        return bob >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length <(long) m * k) return -1;

        long low = Integer.MAX_VALUE;
        long high = Integer.MIN_VALUE;

        for (int a : bloomDay) {
            low = Math.min(low, a);
            high = Math.max(high, a);
        }

        while (low <= high) {
            long mid = low+(high-low) / 2;

            if (check(bloomDay, m, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }
}
