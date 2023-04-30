function solution(arr, n) {
    var answer = [];
    var len = arr.length;
    for(var i = 0; i < len; i++){
        if(len%2!=0){
            answer[i] = arr[i];
            if(i%2===0) answer[i] = arr[i] +n;
        }else{
            answer[i] = arr[i];
            if(i%2!=0) answer[i] = arr[i] +n;
        }
    }
    
    return answer;
}