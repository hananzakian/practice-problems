# https://www.codewars.com/kata/5287e858c6b5a9678200083c

def narcissistic(value):

    x = 0
    for i in str(value):
        x += int(i) ** len(str(value))

    if x == value:
        return True

    return False

print(narcissistic(1634))