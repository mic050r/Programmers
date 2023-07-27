function solution(str_list, ex) {
    var answer = '';
    for(let i of str_list){
       i.includes(ex) ?  answer += "" : answer += i;
    }
    return answer;
}