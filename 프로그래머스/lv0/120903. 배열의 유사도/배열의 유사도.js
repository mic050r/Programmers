function solution(s1, s2) {
    var cnt = 0;
    for(var i of s1){
        for(var j of s2){
            if(i === j)
                cnt++;
        }
    }
    return cnt;
}