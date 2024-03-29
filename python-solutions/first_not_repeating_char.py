#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
'''
class Solution:
    def FirstNotRepeatingChar(self, s):
        # write code here
        if (len(s) == 0): return -1
        res = {}
        for i in s:
            if i in res.keys(): res[i] = res[i] + 1
            else: res[i] = 1
        for j in range(0, len(s)):
            if (res[s[j]] == 1): return j
        return -1