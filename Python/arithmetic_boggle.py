'''
:type magic_number: int 
:type numbers: list[int]
:type rtype: bool
'''
def arithmetic_boggle(magic_number, numbers):
    # Fill in the code
    if not numbers:
        if magic_number == 0:
            return True
        else:
            return False
    dict1 = {0: 1}
    for num in numbers:
        dict2 = {}
        for curr in dict1:
            dict2[curr + num] = dict2.get(curr + num, 0) + dict1[curr]
            dict2[curr - num] = dict2.get(curr - num, 0) + dict1[curr]
        dict1 = dict2
        
    if dict1.get(magic_number,0) > 0:
        return True
    else:
        return False