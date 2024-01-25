# https://datalemur.com/questions/python-maximum-product-three-numbers    

def max_three(input):

    input.sort()
    
    if (input[0] < 0) & (input[1] < 0):
        return input[0] * input[1] * input[-1]
    
    return input[-1] * input[-2] * input[-3]

print(max_three([-4, -2, 3, 5]))