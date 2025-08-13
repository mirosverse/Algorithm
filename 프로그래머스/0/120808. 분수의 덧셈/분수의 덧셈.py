from math import gcd


def solution(n1, d1, n2, d2):
    n = n1 * d2 + n2 * d1
    d = d1 * d2

    common_divisor = gcd(n, d)
    return [n // common_divisor, d // common_divisor]