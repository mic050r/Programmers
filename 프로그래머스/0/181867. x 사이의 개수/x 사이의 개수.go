import ("strings")
func solution(myString string) []int {
    var res []int
    arr := strings.Split(myString, "x")

    for i := range arr {
        res = append(res, len(arr[i]))   
    }
    return res
}
