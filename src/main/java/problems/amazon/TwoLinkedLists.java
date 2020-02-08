package problems.amazon;

public class TwoLinkedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = addTwoNumbers(l1,l2);
        System.out.println("the result is " + result.val + ", " + result.next.val + ", " + result.next.next.val );
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int numl11=0;
        int numl12=0;
        int numl13=0;
        int numl21=0;
        int numl22=0;
        int numl23=0;
        int totSuml1=0;
        int totSuml2=0;
        int grandTot = 0;
            numl11 = l1.val;
            numl12 = l1.next.val;
            numl13 = l1.next.next.val;
            numl21 = l2.val;
            numl22 = l2.next.val;
            numl23 = l2.next.next.val;


        totSuml1 = numl11 + numl12*10 + numl13*100;
        totSuml2 = numl21 + numl22*10 + numl23*100;
        grandTot = totSuml1 + totSuml2;
        String resultStr = String.valueOf(grandTot);
        Character num1Ch = 0;
        Character num2Ch = 0;
        Character num3Ch = 0;
            num1Ch = resultStr.charAt(0);
            num2Ch = resultStr.charAt(1);
            num3Ch = resultStr.charAt(2);
        int num1 = Integer.parseInt(String.valueOf(num1Ch));
        int num2 = Integer.parseInt(String.valueOf(num2Ch));
        int num3 = Integer.parseInt(String.valueOf(num3Ch));
        ListNode result = new ListNode(num3);
        result.next = new ListNode(num2);

        result.next.next = new ListNode(num1);
        return result;

    }
}
