func solution(phone_number string) string {

    number := []byte(phone_number)

    for i := 0; i < len(number)-4; i++ {
        number[i] = '*'
    }
    return string(number)
}