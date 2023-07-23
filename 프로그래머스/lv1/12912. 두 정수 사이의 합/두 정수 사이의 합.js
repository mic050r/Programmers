function solution(a, b) {
    // 변수 선언
    let answer = 0, max = Math.max(a,b), min = Math.min(a,b);
    // 두 정수 사이의 합 구하기
    for(let i = min; i <= max; i++){
        answer += i;
    }
    return answer;
}