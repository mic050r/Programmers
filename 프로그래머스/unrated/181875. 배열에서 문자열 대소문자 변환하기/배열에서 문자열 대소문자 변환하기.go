import "strings"
func solution(strArr []string) []string {
    for idx, str := range strArr{
        if idx % 2 == 0{
            strArr[idx] = strings.ToLower(str)
        }else{
            strArr[idx] = strings.ToUpper(str)
        }
    }
    return strArr
}