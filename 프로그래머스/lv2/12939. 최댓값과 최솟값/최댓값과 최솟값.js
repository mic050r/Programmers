function solution(s) {
    var answer = '';
    list = s.split(" ");
    
    let max = Math.max(...list);
    let min = Math.min(...list);
    
    return min + " " + max;
}