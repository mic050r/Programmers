import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
}