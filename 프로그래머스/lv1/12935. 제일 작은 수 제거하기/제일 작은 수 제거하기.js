function solution(arr) {
    let answer = [];
    // 빈 배열 -1 리턴
    if(arr.length === 1) return[-1];
    // 가장 작은 수 구하기
    let min = Math.min(...arr);
    
    for(let i of arr){
        if(i === min) continue;
        answer.push(i);
    }
    return answer;
}