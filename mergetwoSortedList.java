/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


  public ListNode mergeTwoLists(ListNode l1, ListNode l2){

  	//create a dummy node for this and start compare, later on return 
  	//dummy.next as the answer.
  	Listnode dummy = new ListNode(0);
  	ListNode pointer = dummy;
  	while(l1!=null && l2!=null){
		  	if(l1.val>l2.val){
		  		//we take l2 as the start.
		  		pointer.next = l2;
		  		//update l2 since we moved it.
		  		l2 = l2.next;
		  		// and we need to move pointer outside the if statement
		  	}else{
		  		pointer.next = l1;
		  		l1 = l1.next;
		  	}
		  		pointer = pointer.next;
		}
  		// now we need to check which List finish first and append another other to the dummy list.
		  		if(l1==null){
		  			//we run out l1 already, append l2.
		  			pointer.next = l2;
		  		}if(l2==null){
		  			pointer.next = l1;
		  		}

  		return dummy.next;
  }