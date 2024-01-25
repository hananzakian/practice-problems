# https://datalemur.com/questions/python-salary-inequity

def min_inequity(salaries, n):
    salaries.sort()
    result = salaries[n-1] - salaries[0]
    return result

print(min_inequity([60000, 80000, 120000, 70000], 3))