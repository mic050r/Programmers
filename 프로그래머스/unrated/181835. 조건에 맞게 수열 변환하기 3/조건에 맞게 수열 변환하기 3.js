function solution(arr, k) {
    var answer = [];
    for(var i = 0; i < arr.length; i++){
        if(k%2!==0){
            answer[i] = k*arr[i];
        }else{
            answer[i] = k+arr[i];
        }
    }
    return answer;
}