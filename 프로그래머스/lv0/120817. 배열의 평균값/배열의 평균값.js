function solution(numbers) {
    var total = 0, avg = 0;
    var len = numbers.length;
    for(var i = 0; i < len; i++){
        total += numbers[i];
    }
    avg = total/len;
    return avg;
}