def solution(cipher, code)
    cipher.chars.select.with_index(1) { |c, i| (i % code).zero? }.join
end