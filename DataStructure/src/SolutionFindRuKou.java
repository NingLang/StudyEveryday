public class SolutionFindRuKou {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null|| pHead.next == null){
            return null;
        }
        ListNode NF = pHead;
        ListNode NS = pHead;
        while(NF.next!=null &&NF.next.next!=null){
            NF = NF.next.next;
            NS = NS.next;
            if(NF == NS){
                break;
            }
        }
        if(NF.next==null || NF.next.next==null){
            return null;
        }
        NF = pHead;
        while(NF!=NS){
            NF = NF.next;
            NS = NS.next;

        }
        return NF;
    }
}



class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}