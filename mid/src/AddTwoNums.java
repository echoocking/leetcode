import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNums {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String l1ValueStr = listValue(l1);
        String l2ValueStr = listValue(l2);
        int l1V = Integer.parseInt(new StringBuffer(l1ValueStr).reverse().toString());
        int l2V = Integer.parseInt(new StringBuffer(l2ValueStr).reverse().toString());

        String add_res = Integer.toString(l1V + l2V);
        int l = add_res.length();
        ListNode head = new ListNode(Integer.parseInt(add_res.substring(l-1, l)));
        ListNode tail = head;

        for (int i=l-1; i>0; i--){
            tail.next = new ListNode(Integer.parseInt(add_res.substring(i-1, i)));
            tail = tail.next;
        }

        return head;
    }

    private static String listValue(ListNode firstNode){
        String  res = "";
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
        ListNode l1 = new ListNode(1);
        for (int i=0 ; i<10; i++) {

        }
//        l1.next = new ListNode(3);
        ListNode l2 = new  ListNode(1);
//        l2.next =  new ListNode(5);
        AddTwoNums add = new AddTwoNums();
        ListNode res = add.addTwoNumbers(l1, l2);
        String r = listValue(res);
        System.out.print(r+"---");

    }

}


