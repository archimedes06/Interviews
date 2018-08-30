from math import floor
from itertools import groupby
 
def function3(l, n):
    assert(len(l) > 0 and n > 0)
 
    min = min(l)
    max = max(l)
    d = (max - min) / n
    values = [(floor((l[i] - min) / d)) for i in range(len(l))]
    return {(key, len(list(group))) for key, group in groupby(values)}