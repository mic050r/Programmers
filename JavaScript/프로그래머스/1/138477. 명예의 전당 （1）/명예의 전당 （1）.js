function solution(k, score) {
    const answer = [];
    const process = []

    score.forEach((el) => {
        process.push(el)
        process.sort((a, b) => b - a).splice(k)

        answer.push(process.at(-1))
    })

    return answer;
}