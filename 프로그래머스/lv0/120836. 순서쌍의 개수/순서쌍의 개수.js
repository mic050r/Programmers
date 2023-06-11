function solution(n) {
    var cnt = 0;
    for(let i = 0; i <=n; i++){
        if(n%i === 0) cnt++;
    }
    return cnt;
}