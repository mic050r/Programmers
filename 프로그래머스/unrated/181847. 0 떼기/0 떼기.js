function solution(n_str) {
    let answer = '';
    let len = n_str.length;
    let foundNonZero = false;

    for (let i = 0; i < len; i++) {
        if (!foundNonZero && n_str[i] !== '0') {
            foundNonZero = true;
        }
        if (foundNonZero) {
            answer += n_str[i];
        }
    }
    return answer;
}
