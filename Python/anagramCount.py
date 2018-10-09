#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sherlockAndAnagrams function below.
def sherlockAndAnagrams(s):
    dict = {}
    anagCount = 0
    for i in range(len(s)):
        for j in range(i+1, len(s) + 1):
            cand = list(s[i:j].strip())
            cand.sort()
            anag = ''.join(cand)
            if anag not in dict:
                dict[anag] = 1
            else:
                anagCount = anagCount + dict[anag]
                dict[anag] += 1
    
    return anagCount
            
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = sherlockAndAnagrams(s)

        fptr.write(str(result) + '\n')

    fptr.close()
