# https://datalemur.com/questions/python-max-profit-trading-stocks

def max_profit(prices):
    
    profitOpt = []
    
    x = 0
    while x < len(prices):
        y = x + 1
        while y < len(prices):               
            if prices[x] <= prices[y]:
                diff = prices[y] - prices[x]
                profitOpt.append(diff)
            y += 1
        x += 1
 
    return max(profitOpt)

print(max_profit([9, 1, 3, 6, 4, 8, 3, 5, 5]))