function solution(list) {
    return (list.sort((a,b)=> a-b)).slice(5);
}