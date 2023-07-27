import java.util.ArrayList;

public class Solution {
    public int solution(String dartResult) {
        int score = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        int temp = 0; // 숫자 담을 변수

        for (int i = 0; i < dartResult.length(); i++) {
            char currentChar = dartResult.charAt(i);
            if (Character.isDigit(currentChar)) { // 숫자일 경우
                if (currentChar == '1' && dartResult.charAt(i + 1) == '0') {
                    // 10일 경우 10으로 만들어주고 0을 건너뛰기 위해 i++
                    temp = 10;
                    i++;
                } else { // 0이 아닐 경우 그대로 temp에 넣어줌.
                    temp = Character.getNumericValue(currentChar);
                }
            } else if (currentChar == 'S') { // 1제곱
                answer.add(temp);

            } else if (currentChar == 'D') { // 2제곱
                answer.add((int) Math.pow(temp, 2));

            } else if (currentChar == 'T') { // 3제곱
                answer.add((int) Math.pow(temp, 3));

            } else if (currentChar == '#') {
                answer.set(answer.size() - 1, answer.get(answer.size() - 1) * -1); // 아차상, 해당 점수 -

            } else if (currentChar == '*') { // 스타상, (직전 + 해당) *2
                answer.set(answer.size() - 1, answer.get(answer.size() - 1) * 2);
                if (answer.size() > 1) {
                    answer.set(answer.size() - 2, answer.get(answer.size() - 2) * 2);
                }
            }
        }

        for (int i : answer) { // 보너스, 옵션 적용된 점수들 합치기
            score += i;
        }

        return score;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String dartResult = "1S2D*3T";
        int result = solution.solution(dartResult);
        System.out.println(result); // Output: 37
    }
}
