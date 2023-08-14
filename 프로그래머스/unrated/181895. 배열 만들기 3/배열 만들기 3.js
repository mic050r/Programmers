const solution = (arr, [[s1, e1], [s2, e2]]) => (
    [...arr.slice(s1, e1 + 1), ...arr.slice(s2, e2 + 1)]
)
