class Solution {
    public int solution(int n) {
        int answer = 0;
        // 10진수에서 3진수로 바꾸기 - Integer.toString(a,3)
        String str = Integer.toString(n,3);
        // 문자열 거꾸로 되집기 - String reverse = sb.reverse().toString();
        String reverse = new StringBuilder(str).reverse().toString();
        // 3진수에서 10진수로 바꾸기 - Integer.parseInt(a,3)
        answer = Integer.valueOf(reverse, 3);
        return answer;
    }
}