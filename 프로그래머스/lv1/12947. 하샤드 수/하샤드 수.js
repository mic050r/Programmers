function solution(x) {
    let num = (x+"").split("").reduce((acc, curr) => acc + parseInt(curr), 0);
    return (x%num === 0) ? true : false;
}