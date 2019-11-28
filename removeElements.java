package removeElements;

public class removeElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.next == null && head.val == val) {
            return null;
        }

        //先处理头节点不是要删除节点的情况
        ListNode prev = head;
        ListNode cur = head.next;
        for (; cur != null; cur = cur.next) {
            if (cur.val == val) {
                prev.next = cur.next;
            }else {
                prev = cur;
            }
        }
        //处理头节点
        if (head.val == val) {
            return head.next;
        }

        return head;
    }
}
