def solution(numbers)
    numbers = numbers.sort()
    size = numbers.size
    answer = numbers[size-2]*numbers[size-1]
    return answer
end