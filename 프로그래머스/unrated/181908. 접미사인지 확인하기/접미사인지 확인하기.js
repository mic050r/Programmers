function solution(my_string, is_suffix) {
    var answer = 0;
    let list = [];
    for(i = 0; i < my_string.length; i++){
        list.push(my_string.substring(i, my_string.length));
    }
    for(let i of list){
        if(list.includes(is_suffix)){
            answer = 1;
        } else {
            answer = 0;
        }
    }
    return answer;
}