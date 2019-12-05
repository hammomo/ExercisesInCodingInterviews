#!/usr/bin/python2.7
# -*- coding:utf-8 -*-

'''
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
'''
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def EntryNodeOfLoop(self, pHead):
        # write code here
        if pHead == None or pHead.next == None or pHead.next.next == None: return None
        fast = pHead.next.next
        slow = pHead.next
        while fast != slow:
            if fast.next != None and fast.next.next != None:
                fast = fast.next.next
                slow = slow.next
            else:
                return None
        fast = pHead
        while fast != slow:
            fast = fast.next
            slow = slow.next
        return slow

if __name__ == "__main__":
    a = ListNode(1)
    b = ListNode(2)
    c = ListNode(3)
    d = ListNode(4)
    e = ListNode(5)
    a.next = b
    b.next = c
    c.next = d
    d.next = e
    e.next = c
    print Solution().EntryNodeOfLoop(a).val