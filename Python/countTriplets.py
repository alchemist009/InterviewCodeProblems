#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countTriplets function below.
def countTriplets(arr, r):
    
    d2 = {}
    d3 = {}
    tripCount = 0
    
    for i in arr:
        if i in d3:
            tripCount += d3[i]
        
        if i in d2:
            if i * r in d3:
                d3[i * r] += d2[i]
            else:
                d3[i * r] = d2[i]
        
        if i*r in d2:
            d2[i * r] += 1
        else:
            d2[i * r] = 1
    
    return tripCount

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nr = input().rstrip().split()

    n = int(nr[0])

    r = int(nr[1])

    arr = list(map(int, input().rstrip().split()))

    ans = countTriplets(arr, r)

    fptr.write(str(ans) + '\n')

    fptr.close()
