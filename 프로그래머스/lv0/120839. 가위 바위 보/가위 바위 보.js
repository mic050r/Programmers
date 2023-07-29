function solution(rsp) {
    let result = '';
    for(let i of rsp){
        if(i === '2') result += '0'
        else if(i === '0') result += '5'
        else if(i === '5') result += '2'
    }
    return result;
}