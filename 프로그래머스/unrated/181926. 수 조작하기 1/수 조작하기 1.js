function solution(n, control) {
    for(let x of control){
        if(x === "w") n++;
        else if(x === "s") n--;
        else if(x === "d") n+=10;
        else if(x === "a") n-=10;
    }
    return n;
}