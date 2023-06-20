function solution(num_str) {
    var answer = 0;
    for(let i of num_str){
        answer += parseInt(i);
    }
    return answer;
}