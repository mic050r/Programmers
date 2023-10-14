def solution(num_list)
    n = 0
    num_list.collect{|d|
        if d < 0
            ret = n 
        end
        n += 1
        break if d < 0 
    }
    n -= 1
    if n == num_list.size - 1
        return -1
    else
        return n
    end
end