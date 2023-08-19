import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int[] indexList) {
        return Arrays.stream(indexList).mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());
    }
}