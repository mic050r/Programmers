def solution(N, stages):
    fail_perc = []
    for _ in xrange(1, N + 1):
        denom = 0
        numer = 0
        for stage in stages:
            if stage >= _:
                denom += 1
            if stage == _:
                numer += 1
        try:
            fail_perc.append((_, numer / float(denom)))
        except:
            fail_perc.append((_, 0))
    fail_perc.sort(key=lambda x: x[1], reverse=True)
    return [_[0] for _ in fail_perc]