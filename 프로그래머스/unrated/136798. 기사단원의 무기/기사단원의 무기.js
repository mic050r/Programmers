function solution(number, limit, power) {
    let answer = [];
  
    // 1. 약수 개수 구하기
    for (let i = 1; i <= number; i++) {
        let cnt = 0;
        for (let j = 1; j * j <= i; j++) {
            if (i % j === 0) {
                cnt += (j * j === i) ? 1 : 2;
            }
        }
        answer.push(cnt);
    }
  
    // 2. 제한 수치 구하기
    for (let i = 0; i < answer.length; i++) {
        if (answer[i] > limit) {
            answer[i] = power;
        }
    }
  
    // 3. 합 구하기
    const result = answer.reduce((acc, val) => acc + val, 0);
  
    return result;
}
