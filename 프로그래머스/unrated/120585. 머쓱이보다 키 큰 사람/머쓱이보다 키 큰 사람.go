import "sort"
func solution(array []int, height int) int {

    sort.Ints(array)
    for i, v := range array {
        if v > height {
            return len(array) - i
        }
    }

    return 0
}