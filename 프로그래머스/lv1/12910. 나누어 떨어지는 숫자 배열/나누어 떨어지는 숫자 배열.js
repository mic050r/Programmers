function solution(arr, divisor) {
    let answer = [], cnt = 0;
    arr.sort((a,b)=> a-b);
    for(let i of arr){
        if(i%divisor === 0) answer.push(i)
        else cnt++
    }
    if(cnt === arr.length) return[-1]
    return answer;
}