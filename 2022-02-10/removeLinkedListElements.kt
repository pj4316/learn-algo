class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        if(head == null) {
            return null;
        }

        if(head.`val` == `val`) {
            return removeElements(head.next, `val`);
        }

        var current = head;
        while (current != null) {
            if (current.next?.`val` == `val`) {
                current.next = removeElements(current.next?.next, `val`);
            }
            current = current.next;
        }

        return head;
    }
}
