function solution(num_list) {
    var len = num_list.length;
    var total = 0;
    if(len > 10) {
        for(var i of num_list) total += i;
    }
    else{
        total = 1;
        for(var i of num_list) total *= i;
    }
    return total;
}