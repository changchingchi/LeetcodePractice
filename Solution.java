public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> temp;
// we keep tracking only one level up. 
        if(rowIndex<0) return result;
        for(int i=-1;i<rowIndex;i++){
            temp = new ArrayList<Integer>();
            temp.add(1);
            if(i>-1){
                for(int j=0;j<result.size()-1;j++){
                     temp.add(result.get(j)+result.get(j+1));
                }
                temp.add(1); 
            }
            result = temp;
        }
            return result;
    }
         public int trailingZeroes(int n) {
            if ( n<0 ) return -1;
            int count = 0;
            for (long i=5; n/i>=1; i*=5) {
                count += n / i;
            }        
            return count;
        }
        public int reverseInt(int n){
        //this is pure math quesitons...
        // 123-->321
        // -123 --> -321
        int result = 0;
        while(n!=0){
            result = result*10+n%10;
            n = n/10;
        }
        return result;

     }

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
  public String convertToTitle(int n) {
        char[] a = {'A','B','C','D','E','F','G','H','I','J',
                    'K','L','M','N','O','P','Q','R','S',
                    'T','U','V','W','X','Y','Z' };
        StringBuilder S = new StringBuilder();
        int temp =0;
        while(n!=0){
            temp = n%26;
            n = n/26 ;
            if(temp==0){//when n = 26/52/...
                temp = 26;
                n=n-1; // since its 26's multiple, n-1
            }
           
            S.append(a[temp-1]);
        }
           
        return S.reverse().toString();
    }
}