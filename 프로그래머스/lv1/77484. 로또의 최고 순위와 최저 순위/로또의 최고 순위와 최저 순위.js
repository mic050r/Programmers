function solution(lottos, win_nums) {
    var answer = [];
    // 맞힌 개수 +- 0의 갯수 
    let correct = 0, zero = 0;
    let max, min = 0;
    
    for (let i of lottos) {
        if (i === 0) zero++;
        else answer.push(i);
    }

    for (let i of answer) {
        for (let j of win_nums) {
            if (i === j) correct++;
        }
    }

    max = correct_cnt(correct + zero);
    min = correct_cnt(correct);
    
    return [max, min];
}

// 순위 정하기
const correct_cnt = function(score) {
    let result = 0;
    switch (score) {
        case 6: result = 1; break;
        case 5: result = 2; break;
        case 4: result = 3; break;
        case 3: result = 4; break;
        case 2: result = 5; break;
        default: result = 6; break;
    }
    return result;
}
