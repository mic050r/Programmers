def solution(n, numlist)
  result = numlist.select { |num| num % n == 0 }
  return result
end