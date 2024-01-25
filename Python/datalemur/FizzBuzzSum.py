# https://datalemur.com/questions/python-fizz-buzz-sum

def fizz_buzz_sum(target):     
   
    sum = 0
    
    for i in range(1,target):
        if i % 3 == 0:
            sum += i
        elif i % 5 == 0:
            sum += i
            
    return sum
    
print(fizz_buzz_sum(16))