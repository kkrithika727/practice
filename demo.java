public class Demo {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(null==list1) return list2;
        if(null==list2) return list1;
        ListNode node = new ListNode();
        if(list1.val <= list2.val){
            node.val = list1.val;
            node.next = mergeTwoLists(list1.next,list2);
        }
        else{
            node.val = list2.val;
            node.next = mergeTwoLists(list1,list2.next);
        }
        return node;
    }
    public static void main (String args[])
    {
    }
}
