function solution(s){
    let p = 0, y = 0;
    for(let i of s.toLowerCase()){
        if(i === 'p') p++;
        if(i === 'y') y++;
    }
    return p === y ? true : false;
}