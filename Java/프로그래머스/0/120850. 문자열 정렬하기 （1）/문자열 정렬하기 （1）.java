import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static List<Integer> solution(String my_string) {
        List<Integer> numbers = my_string.chars()
            .filter(Character::isDigit) // 숫자만 필터링
            .mapToObj(Character::getNumericValue) // 문자를 숫자로 변환
            .sorted() // 오름차순 정렬
            .collect(Collectors.toList()); // 리스트로 변환
        return numbers;
    }
}