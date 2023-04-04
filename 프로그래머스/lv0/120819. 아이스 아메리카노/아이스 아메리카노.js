function solution(money) {
    var answer = [];
    var cnt, changes; // 아이스아메리카의 갯수, 잔돈
    cnt = money / 5500;
    changes = money % 5500;
    answer[0] = Math.floor(cnt);
    answer[1] = changes;
    
    return answer;
}