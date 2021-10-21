from math import floor
from itertools import groupby

def function3(l, n):
  assert(len(l) > 0 and n > 0)
  minimum = min(l)
  maximum = max(l)
  d = (maximum - minimum) / n
  values = [(floor((l[i] - minimum) / d)) for i in range(len(l))]
  return [(minimum + d*(key+0.5), len(list(group))) for key, group in groupby(sorted(values))]