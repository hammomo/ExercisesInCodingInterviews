#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
'''
class Solution:
    # s字符串
    def isNumeric(self, s):
        if len(s) == 0: return False
        s = s.lower()
        if s[1] in ['-', '+'] or s[-1] in ['e', '+', '-'] or s[0] == 'e': return False
        e_skip_arr = s.split('e')
        if len(e_skip_arr) > 2: return False
        else:
            if len(e_skip_arr) == 2:
                after = e_skip_arr[1]
                if '.' in after: return False
                if not self.isNumericWithoutE(after): return False
            before = e_skip_arr[0]
            dot_skip_arr = before.split('.')
            if len(dot_skip_arr) > 2: return False
            elif len(dot_skip_arr) == 2:
                if '-' in dot_skip_arr[1] or '+' in dot_skip_arr[1] or not self.isNumericWithoutE(dot_skip_arr[1]): return False
            if not self.isNumericWithoutE(dot_skip_arr[0]): return False
        return True

    def isNumericWithoutE(self, s):
        tmp = s
        if tmp[0] in ['-', '+']: tmp = tmp[1:]
        for i in tmp:
            if i < '0' or i > '9': return False
        return True

if __name__ == "__main__":
    print "+100: ", Solution().isNumeric("+100")
    print "5e2: ", Solution().isNumeric("5e2")
    print "-123: ", Solution().isNumeric("-123")
    print "3.1416: ", Solution().isNumeric("3.1416")
    print "-1E-16: ", Solution().isNumeric("-1E-16")
    print '---------------------------'
    print "12e: ", Solution().isNumeric("12e")
    print "1a3.14: ", Solution().isNumeric("1a3.14")
    print "1.2.3: ", Solution().isNumeric("1.2.3")
    print "+-5: ", Solution().isNumeric("+-5")
    print "12e+4.3: ", Solution().isNumeric("12e+4.3")

