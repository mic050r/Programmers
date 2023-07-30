function solution(age) {
    var answer = '';
    let age_list = ['a','b','c','d','e','f','g', 'h','i','j'];
    age = age.toString();
    for(let i of age){
        answer += age_list[i];
    }
    return answer;
}