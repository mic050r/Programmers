function solution(myString) {
    let answer = myString.toLowerCase()
    return answer.replaceAll(/a/g, "A");
}