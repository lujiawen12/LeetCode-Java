public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return head.next;
    }

    public static ListNode convertListNode(int[] array){
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int anArray : array) {
            curr.next = new ListNode(anArray);
            curr = curr.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] p = {};
        int[] q = {9,9};
        ListNode l1 = convertListNode(p);
        ListNode l2 = convertListNode(q);
        ListNode sum = addTwoNumbers(l1, l2);
        System.out.println("Hello world");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
