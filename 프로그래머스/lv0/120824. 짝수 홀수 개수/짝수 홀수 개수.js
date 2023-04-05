function solution(num_list) {
    var answer = [];
    var odd = 0, even = 0; //홀수 , 짝수
    for(var i = 0; i < num_list.length; i++){
        var answer = (num_list[i] % 2 == 0) ? even++ : odd++;
    }
    return [even,odd];
}