# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} headA
# @param {ListNode} headB
# @return {ListNode}
def getIntersectionNode(headA, headB)
    a = headA
    b = headB

    while a != b
        if !a.nil?
            a = a.next
        else
            a = headB
        end

        if !b.nil?
            b = b.next
        else
            b = headA
        end
    end

    a
end