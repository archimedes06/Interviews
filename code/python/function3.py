from itertools import groupby
from math import floor


def function3(l, n):
    assert len(l) > 0 and n > 0
    minimum = min(l)
    maximum = max(l)
    d = (maximum - minimum) / n
    values = [min(n - 1, (floor((l[i] - minimum) / d))) for i in range(len(l))]
    dictionary = dict(
        [(key, len(list(group))) for key, group in groupby(sorted(values))]
    )
    return [(minimum + (i + 0.5) * d, dictionary.get(i, 0)) for i in range(0, n, 1)]
