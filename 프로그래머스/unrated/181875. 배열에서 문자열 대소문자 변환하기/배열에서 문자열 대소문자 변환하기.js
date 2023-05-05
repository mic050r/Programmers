function solution(strArr) {
    var answer = [];
    for(var i = 0; i < strArr.length; i++){
        if(i%2!=0){
            answer[i] = strArr[i].toUpperCase();
        }else{
            answer[i] = strArr[i].toLowerCase();
        }
    }
    return answer;
}