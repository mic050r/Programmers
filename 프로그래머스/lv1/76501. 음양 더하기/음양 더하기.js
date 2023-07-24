function solution(absolutes, signs) {
    let sum = 0;
    let answer = absolutes.map(function (trunc, i){
        if(signs[i]) sum += trunc;
        else sum += (-1)*trunc;
    })
    return sum;
}