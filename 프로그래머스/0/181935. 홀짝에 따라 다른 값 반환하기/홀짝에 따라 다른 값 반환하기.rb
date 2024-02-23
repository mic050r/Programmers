def solution(n)
  if n.odd?
    (1..n).step(2).sum
  else
    (2..n).step(2).sum {|num| num**2}
  end
end
