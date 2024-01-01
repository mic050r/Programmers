function solution(binomial) {
    let arr = binomial.split(' ');
    let answer = 0;
    let num1 = Number(arr[0]);
    let num2 = Number(arr[2]);
    if(arr[1] === '+'){
         answer = num1 + num2;
    } else if(arr[1] === '-'){
         answer = num1 - num2;
    } else if(arr[1] === '*'){
         answer = num1 * num2;
    }
    return answer;
}