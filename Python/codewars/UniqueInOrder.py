# https://www.codewars.com/kata/54e6533c92449cc251001667

def unique_in_order(sequence):

    unique = []

    if len(sequence) == 0:
        return unique
    
    unique.append(sequence[0])
    for i in range(len(sequence)-1):
        if sequence[i+1] != sequence[i]:
            unique.append(sequence[i+1])

    return unique

print(unique_in_order("HHAA"))