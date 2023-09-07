func solution(numbers []int) float64 {
    var res float64
    for _, v := range numbers {
        res += float64(v)
    }
    res = res/float64(len(numbers))
    return res
}