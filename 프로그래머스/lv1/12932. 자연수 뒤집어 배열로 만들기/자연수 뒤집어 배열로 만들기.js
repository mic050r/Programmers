function solution(n) {
    var answer = [];
    for(let x of n.toString()){
        answer.unshift(Number(x));
    }
    return answer;
}