#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter
from string import ascii_lowercase

# Complete the makeAnagram function below.
def makeAnagram(a, b):
    count = 0
    counta = Counter()
    countb = Counter()
    
    for c in a:
        counta[c] += 1
    
    for c in b:
        countb[c] += 1
    
    for c in ascii_lowercase:
        if counta[c] != countb[c]:
            count += abs(counta[c] - countb[c])

    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = input()

    b = input()

    res = makeAnagram(a, b)

    fptr.write(str(res) + '\n')

    fptr.close()
