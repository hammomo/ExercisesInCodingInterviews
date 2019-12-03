#!/usr/bin/python2.7
# -*- coding:urtf-8 -*-

'''
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
'''
class Solution:
    def NumberOf1Between1AndN_Solution(self, n):
        arr = range(1,n+1)
        str_arr = map(lambda x: str(x), arr)
        arr_contains_1 = filter(lambda x: '1' in x, str_arr)
        count = 0
        for i in arr_contains_1:
            for ch in i:
                if (ch == '1'): count+=1
        return count
