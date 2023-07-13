function solution(num_list) {
    var answer = [];
    for(var i of num_list){
        answer.push(i);
    }
    let last1 = answer[answer.length - 1];
    let last2 = answer[answer.length - 2];
    
    if(last2 < last1) answer.push(last1 - last2); 
    else answer.push(last1*2);
    
    return answer;
}