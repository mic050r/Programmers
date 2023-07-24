function solution(arr) {
    // 다른 사람의 풀이2
    arr.splice(arr.indexOf(Math.min(...arr)),1);
    if(arr.length<1)return[-1];
    return arr;
}