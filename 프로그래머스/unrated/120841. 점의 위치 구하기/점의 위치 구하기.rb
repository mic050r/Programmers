def solution(dot)
    x, y = dot
    if x > 0
        return 1 if y > 0
        return 4
    end
    return 2 if y > 0
    return 3
end
