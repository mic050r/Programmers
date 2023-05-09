function solution(arr, k) {
    var answer = [];
    for(var i of arr){
        if(k%2!==0){
            answer.push(i*k);
        }else{
            answer.push(i+k);
        }
    }
        // for(var i = 0; i < arr.length; i++){
    //     if(k%2!==0){
    //         answer[i] = k*arr[i];
    //     }else{
    //         answer[i] = k+arr[i];
    //     }
    // }
    return answer;
}