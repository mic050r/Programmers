function solution(arr1, arr2) {
    var answer = 0, sum1 = 0, sum2 = 0;
    sum1 = arr1.reduce((acc,cal)=> acc+cal);
    sum2 = arr2.reduce((acc,cal)=> acc+cal);
    if(arr1.length !== arr2.length){
        answer = arr1.length > arr2.length ? 1 : -1;
    }
    else {
        if(sum1 > sum2) answer = 1;
        else if(sum2 > sum1) answer = -1;
        else answer = 0;
    }
    return answer;
}