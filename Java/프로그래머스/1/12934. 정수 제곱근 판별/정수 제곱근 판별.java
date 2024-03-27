class Solution {
    public static long solution(long n) {
        double sqrt = Math.sqrt(n);
        if (Math.floor(sqrt) == sqrt) {
            return (long) Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}