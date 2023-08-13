function solution(arr, delete_list) {
    var answer = [];
    for(let i = 0; i < arr.length; i++){
        let index = delete_list.indexOf(arr[i]);
        if(index === -1) answer.push(arr[i]);
    }
    return answer;
}