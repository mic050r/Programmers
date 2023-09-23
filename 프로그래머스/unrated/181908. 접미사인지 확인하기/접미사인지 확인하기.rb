def solution(my_string, is_suffix)
    suffixs = (0..my_string.size).map { |index| my_string[-index..]}.uniq.sort
    return suffixs.include?(is_suffix) ? 1 : 0
end