#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
'''
class Solution:
    # 返回对应char
    def __init__(self):
        self.s = ''
        self.char_dict = {}

    def FirstAppearingOnce(self):
        # write code here
        for i in self.s:
            if self.char_dict[i] == 1: return i
        return '#'

    def Insert(self, char):
        # write code here
        self.s = self.s + char
        if char in self.char_dict:
            self.char_dict[char] += 1
        else:
            self.char_dict[char] = 1

if __name__ == "__main__":
    test = Solution()
    for str in 'google':
        test.Insert(str)
        print test.FirstAppearingOnce()