function solution(num_list) {
    let answer = 0, odd = 0, even = 0;
    const list = num_list.map(function(arr){
        if(arr%2) return even += `${arr}`;
        else odd += `${arr}`;
    });
    answer = Number(odd) + Number(even);
    return answer;
}