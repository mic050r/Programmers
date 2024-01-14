func solution(price int) int {
    switch {
        case price < 100000:
            return price
        case price >= 100000 && price < 300000:
            return int(float64(price) * 0.95)
        case price >= 300000 && price < 500000:
            return int(float64(price) * 0.9)
        case price >= 500000:
            return int(float64(price) * 0.8)
    }
    return price
}