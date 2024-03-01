## Linked List
### Description

LinkedList is a data structure in which data is stored in a linear manner. It usually contains a data field and a link to the memory location of the next mode.

###  Definition for singly-linked list

```
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
```

The `next` variable points to the next node in the data structure and value stores the data. Any number of nodes can be linked in this manner. The structure will be:


### Properties
1. Linked list does not provide indexing like an array. For accessing a node at position `p` , &theta;(p) nodes need to be accessed.
2. Main advantage of linked list is addition and removal of nodes near the end and beginning of lists. It can be done just by updating the link (O(1) time)
3. Unlike an array, its size is not predefined. So any number of nodes can be appended.

### File descriptions:

1. [design-circular-queue](https://leetcode.com/problems/design-circular-queue)
2. [design-linked-list](https://leetcode.com/problems/design-linked-list)
3. [count-nodes-of-linked-list](https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list)
4. [linked-list-cycle](https://leetcode.com/problems/linked-list-cycle)
5. [merge-k-sorted-lists](https://leetcode.com/problems/merge-k-sorted-lists)
6. [remove-duplicates-from-sorted-list](https://leetcode.com/problems/remove-duplicates-from-sorted-list)
7. [remove-duplicates-from-sorted-list-ii](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii)
8. [remove-nth-node-from-end-of-list](https://leetcode.com/problems/remove-nth-node-from-end-of-list)
