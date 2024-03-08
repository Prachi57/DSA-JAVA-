public class Solution {
    public int Count(ListNode head) {
      int n=0;
      ListNode curr=head;
      while(curr.next!=null){
        n++;
        curr=curr.next;
        
    }
      return n;
}
