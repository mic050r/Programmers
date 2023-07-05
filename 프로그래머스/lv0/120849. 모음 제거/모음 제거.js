function solution(my_string) {
    var answer = '';
    for(let i of my_string){
        if(!(i === 'a' || i === 'e' || i === 'i' || i === 'o' || i === 'u')){
            answer += i;
        }
    }
    return answer;
}