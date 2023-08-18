function solution(number) {
    let result = 0;

    const combination = (current, start) => {
        if (current.length === 3) {
            result += current.reduce((acc, cur) => acc + cur, 0) === 0 ? 1 : 0;
            return;
        }

        for (let i = start; i < number.length; i++) {
            combination([...current, number[i]], i + 1);
        }
    }
    combination([], 0);
    return result;
}

// 서로 다른 사람 3명을 필요로하므로
// 조합 활용 => 3명이 존재 => 그 합을 구하여 0이면 count++;
// combination 함수 사용