function solution(my_string) {
    var answer = '';
    for(let i of my_string){
        let n = i.charCodeAt();
        if(97 <= n && n <= 122){
            answer += i.toUpperCase();
        }else if(65 <= n && n <= 90){
            answer += i.toLowerCase();
        }
    }
    return answer;
}