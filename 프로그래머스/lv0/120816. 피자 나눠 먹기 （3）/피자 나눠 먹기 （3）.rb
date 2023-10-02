def solution(slice, n)
    answer = 0
    pizza = 0

    until pizza >= n do
        answer +=1
        pizza =  slice*answer
    end
    return answer
end