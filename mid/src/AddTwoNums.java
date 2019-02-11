/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */


public class AddTwoNums {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String l1ValueStr = listValue(l1);
        String l2ValueStr = listValue(l2);

        if (l1ValueStr.equals("0")) {
            return l2;
        } else if (l2ValueStr.equals("0")) {
            return l1;
        }

        String longStr, shortStr;
        if (l2ValueStr.length() > l1ValueStr.length()) {
            longStr = l2ValueStr;
            shortStr = l1ValueStr;

        } else {
            longStr = l1ValueStr;
            shortStr = l2ValueStr;
        }

        int longLen = longStr.length();
        int shortLen = shortStr.length();
        int currentNum = 0;
        int carry = 0;
        int value = 0;
        int loopIndex=0;
        StringBuffer result = new StringBuffer(longLen+1);
        for (; loopIndex < shortLen; loopIndex++) {
            currentNum = shortStr.charAt(loopIndex) + longStr.charAt(loopIndex) - 2 * '0' + carry;
            carry = currentNum / 10;
            value = currentNum % 10;
            result.append(value);
        }

        for (; loopIndex < longLen; loopIndex++) {
            currentNum = longStr.charAt(loopIndex) - '0' + carry;
            carry = currentNum / 10;
            value = currentNum % 10;
            result.append(value);
        }

        if (carry != 0) {
            result.append(carry);
        }

        ListNode head = new ListNode(Character.getNumericValue(result.charAt(0)));
        ListNode tail = head;
        for (int j=1; j < result.length(); j++) {
            tail.next = new ListNode(Character.getNumericValue(result.charAt(j)));
            tail = tail.next;

        }
        return head;

    }

    private static String listValue(ListNode firstNode){
        String res = "";
        ListNode head = firstNode;
        ListNode tail = firstNode.next;
        res += Integer.toString(head.val);

        while (tail != null) {
            res += Integer.toString(tail.val);
            tail = tail.next;
        }
        return res;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNums add = new AddTwoNums();
        ListNode res = add.addTwoNumbers(l1, l2);
        System.out.print(listValue(res));
//        return res;

    }

}

/**
 * 1.
 * 解答错误
 * 输入
 * [1,8]
 * [0]
 * 输出
 * [8,1]
 * 预期结果
 * [1,8]
 * l1ValueStr.equals("") ❌ 原因：返回值判断错误；逆序 排列 可以直接加，不用reverse。
 * l1ValueStr.equals("0")
 *
 * 2.最后一位如果有进位，需要处理
 */


