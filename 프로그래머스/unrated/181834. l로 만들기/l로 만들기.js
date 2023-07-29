function solution(myString) {
    var answer = '';
    for(x of myString){
        if(x < 'l') answer += 'l';
        else answer += x;
    }
    return answer;
}