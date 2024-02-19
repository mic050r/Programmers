def solution(num_list)
    temp = 1
    temp = num_list.sum if num_list.size > 10

    num_list.collect{|a| temp *= a} if num_list.size < 11
    ret = temp
    return ret
end