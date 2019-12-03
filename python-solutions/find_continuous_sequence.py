#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
'''
class Solution:
    def FindContinuousSequence(self, tsum):
        res = []
        plow = 1
        phigh = 2
        while (phigh > plow):
            current = (plow + phigh) * (phigh - plow + 1) / 2
            if (current == tsum): 
                res.append(range(plow, phigh + 1))
                plow += 1
            elif (current < tsum): phigh += 1
            else: plow += 1
        return res

if __name__ == "__main__":
    result = Solution().FindContinuousSequence(100)
    for arr in result:
        print arr