function solution(arr, delete_list) {
    var answer = [];
    return arr.filter(e => !delete_list.includes(e));
}