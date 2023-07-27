function solution(my_string) {
    let answer = 0;
    for(let i of my_string) {
        if(i > 0 && i < 10) {
            answer += Number(i);
        }
    }
    return answer;
}