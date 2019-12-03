#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 
数值为0或者字符串不是一个合法的数值则返回0
'''
class Solution:
    def StrToInt(self, s):
        if not s: return 0
        str_dict = {'1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9, '0': 0}
        flag_dict = {'-': -1, '+': 1}
        first = s[0]
        rest = s
        flag = 1
        x = 0
        if first in ['+', '-']:
            flag = flag_dict[first]
            rest = s[1:]
            if len(s) == 1: return 0
        for i in rest:
            if i not in str_dict: return 0
            x = x*10 + str_dict[i]
        return x*flag if x*flag >= -0X80000000 and x*flag <= 0X7FFFFFFF else 0 # python doesn't handle out bounds

if __name__ == "__main__":
    print Solution().StrToInt('2147483648')