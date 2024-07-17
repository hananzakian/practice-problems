# https://www.codewars.com/kata/541c8630095125aba6000c00/train/python

def sum(n):
    if (n//10 == 0):
        return n
    return sum(n%10 + sum((n-(n%10))//10))

print(sum(132189))
