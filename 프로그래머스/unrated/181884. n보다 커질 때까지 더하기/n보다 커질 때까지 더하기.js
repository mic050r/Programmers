function solution(numbers, n) {
    let total = 0;
    for(let i of numbers){
        total += i;
        if(total > n) return total;
    }
}