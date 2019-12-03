#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
 如果牌能组成顺子就输出true，否则就输出false。
 为了方便起见,你可以认为大小王是0。
'''
class Solution:
    def IsContinuous(self, numbers):
        if (len(numbers) != 5): return False
        numbers.sort()
        if (numbers[0] < 0 or numbers[-1] > 13): return False
        num_0 = numbers.count(0)
        for i in range(1,len(numbers)):
            if (numbers[i - 1] == 0): continue
            if (numbers[i] == numbers[i-1]): return False
            num_0 = num_0 - (numbers[i] - numbers[i-1] - 1)
            if (num_0 < 0): return False
        return True

if __name__ == "__main__":
    print Solution().IsContinuous([])