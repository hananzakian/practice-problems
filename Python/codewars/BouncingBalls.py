# https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/python

def look(h, bounce, window):
    if h <= 0 or bounce <= 0 or bounce >= 1 or window >= h:
        return -1
    
    count = 0
    while h > window:
        count += 2 # 2 karena ada 2 proses dalam 1 lemparan: "naikan" & "turunan"
        h = h*bounce
    
    return count-1 # -1 di sini karena di lemparan pertama tidak ada "naikan", sedangkan harusnya ada 2 ("naikan" lalu "turunan")

def look2(h, bounce, window): # cara lain
    # If initial conditions are invalid, return -1 immediately
    if h <= 0 or bounce <= 0 or bounce >= 1 or window >= h:
        return -1

    count = 0
    while h > window:
        count += 1  # The ball is seen when falling
        h *= bounce
        if h > window:
            count += 1  # The ball is seen when bouncing up

    return count

print(look(2, 0.5, 1))

