function solution(numbers) {
    var answer = 0;
    let x = 0;
    numbers.sort((a, b) => a - b);
    
    for(let i = 0; i <= 9; i++){
        if(numbers[x] !== i){
            answer += i; 
            x--;
        }
        x++;
    }
    return answer;
}
