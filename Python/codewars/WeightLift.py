# Problem's link: https://www.codewars.com/kata/59a8782bdbe3b04e740000cd

def liftingCalc(w):
    bar_total = (w - 20)/2

    bar_opt = [20, 15, 10, 5, 2.5, 1.25]

    bar_list = []
    bar_sum = 0

    for i in range(len(bar_opt)):
        for j in range(len(bar_opt)):
            if (bar_sum + bar_opt[i] <= bar_total):
                bar_sum += bar_opt[i]
                bar_list.append(bar_opt[i])
        
    if bar_sum != bar_total:
        return False
    
    return True

def liftingCalcExpl(w):
    bar_total = (w - 20)/2

    bar_opt = [20, 15, 10, 5, 2.5, 1.25]

    bar_list = []
    bar_sum = 0

    for i in range(len(bar_opt)):
        for j in range(len(bar_opt)):
            if (bar_sum + bar_opt[i] <= bar_total):
                bar_sum += bar_opt[i]
                bar_list.append(bar_opt[i])
    
    print(bar_list)
    print(bar_sum)
    print(bar_total)
        
    if bar_sum != bar_total:
        print(False)
    else:
        print(True)

# Program

w = 175

print(liftingCalc(w))
liftingCalcExpl(w)