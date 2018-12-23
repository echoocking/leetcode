//import java.util.ArrayList;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//
//public class AddTwoNums1 {
//    private ListNode l1;
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ArrayList carry = new ArrayList();
//        ArrayList surplus = new ArrayList();
//        ListNode loopL1 = l1;
//        ListNode loopL2 = l2;
//        while (loopL1 != null & loopL2 != null) {
//            int[] carryAndsurplusNext = oneAndTen(loopL1, loopL2);
//            carry.add(carryAndsurplusNext[0]);
//            surplus.add(carryAndsurplusNext[1]);
//            loopL1 = loopL1.next;
//            loopL2 = loopL2.next;
//        }
//        // 进行剩余数字赋值
//        if (loopL1 != null) {
//            while (loopL1 != null) {
//                surplus.add(loopL1.val);
//                loopL1 = loopL1.next;
//            }
//        } else if (loopL2 != null) {
//            while (loopL2 != null) {
//                surplus.add(loopL2.val);
//                loopL2 = loopL2.next;
//            }
//        }
//
//        ArrayList addRes = new ArrayList<Integer>();
////        ArrayList mainLoopArr;
////        ArrayList otherArr;
//
//        addRes.add(surplus.get(0));
//        if (surplus.size() > carry.size()) {
//            for (int i = 1; i < surplus.size(); i++) {
////                addRes.add(surplus.get(i)+carry.get(i));
//            }
//
//        } else {
//            mainLoopArr = carry;
//            otherArr = surplus;
//        }
////        for (int i = 1; i < mainLoopArr.size(); i++) {
////            surplus[i]
////            addRes.add()
////        }
//
//    }
//
//
//    private int[] oneAndTen(ListNode l1, ListNode l2) {
//        int one_by_one_sum = l1.val + l2.val;
//        int[] carryAndSurplus = new int[2];
//        if (one_by_one_sum >= 10) {
//            carryAndSurplus[0] = 1;
//            carryAndSurplus[1] = one_by_one_sum - 10;
//        } else {
//            carryAndSurplus[0] = 0;
//            carryAndSurplus[1] = one_by_one_sum;
//        }
//
//        return carryAndSurplus;
//    }
//}
//
//// https://leetcode-cn.com/problems/add-two-numbers/