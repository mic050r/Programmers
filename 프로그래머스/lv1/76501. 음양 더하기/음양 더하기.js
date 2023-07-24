function solution(absolutes, signs) {
    let sum = 0;
    let answer = absolutes.map(function (trunc, i){
        sum += trunc*(signs[i] ? 1 : -1)
    })
    return sum;
}