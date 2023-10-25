def solution(x, n)
    answer = []
    n.times do |a|
        answer << x * (a + 1)
    end
    return answer
end