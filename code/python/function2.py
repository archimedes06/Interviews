def foo(r, c):
    if c in (0, r):
        return 1
    return foo(r - 1, c - 1) + foo(r - 1, c)


def function2(n):
    return [[foo(r, c) for c in range(r + 1)] for r in range(n)][n - 1]
