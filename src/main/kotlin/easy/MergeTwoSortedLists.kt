package easy

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result: ListNode? = ListNode(0)
        var current = result

        var node1 = list1
        var node2 = list2
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                current?.next = node2
                break
            }
            if (node2 == null) {
                current?.next = node1
                break
            }

            if (node1?.`val` < node2?.`val`!!) {
                current?.next = node1
                node1 = node1?.next
            } else {
                current?.next = node2
                node2 = node2?.next
            }
            current = current?.next
        }
        return result?.next

    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}