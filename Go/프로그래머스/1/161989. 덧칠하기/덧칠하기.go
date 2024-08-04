func solution(n int, m int, section []int) int {
    answer, paint := 0, 0
    for _, v := range section{
        if v >= paint{
            answer++
            paint = v + m
        }
    }
    return answer
}