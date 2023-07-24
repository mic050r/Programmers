function solution(arr) {
    // 다른 사람의 풀이1
    const min = Math.min(...arr);
    return arr.length !== 1 ? arr.filter(i => i !== min) : [-1]
}