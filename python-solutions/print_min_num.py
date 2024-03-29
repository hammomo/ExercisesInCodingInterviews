#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为321323。
冒泡
'''
class Solution:
    def PrintMinNumber(self, numbers):
        # write code here
        length = len(numbers)
        if (length == 0): return ''
        str_arr = map(lambda x: str(x), numbers)
        for i in range(length-1):
            for j in range(length-i-1):
                if int(str_arr[j] + str_arr[j+1]) > int(str_arr[j+1]+ str_arr[j]):
                    str_arr[j], str_arr[j+1] = str_arr[j+1], str_arr[j]
        num = ''.join(str_arr)
        return num