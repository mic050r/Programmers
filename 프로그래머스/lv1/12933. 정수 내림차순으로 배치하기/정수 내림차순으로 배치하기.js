function solution(n) {
    // 변수 선언
    var list = "";
    let answer = "";
    // 내림차순
    list += (n.toString()).split("").sort((a,b)=> b-a);
    
    // 배열을 문자열로
    for(let i of list){
        if(i === ',') continue;
        answer += i;
    }
    return Number(answer);
}