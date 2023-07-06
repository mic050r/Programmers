function solution(n) {
    var answer = 0;
    n = n.toString();
    for(let x of n){
        answer += Number(x);
    }
    return answer;
}