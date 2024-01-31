func solution(names []string) []string {
    result := []string{}
    for i := 0; i < len(names); i += 5{
        result = append(result, names[i])
    }
    return result
}