

class Solution {
    public Node copyRandomList(Node head) {
Node dummy = new Node(Integer.MAX_VALUE);
Node curr = dummy;
Node temp = head;
Map<Node,Node>  map=new HashMap<>();


while (temp != null) {
    curr.next = new Node(temp.val);
    map.put(temp,curr.next);

    curr = curr.next;
    temp = temp.next;
}
temp=head;
curr=dummy.next;

while(temp!=null){
    if (!map.containsKey(temp.random)){
        curr.random=null;
      

    }
    else 
    curr.random=map.get(temp.random);
    curr=curr.next;
    temp=temp.next;



}
return dummy.next;




        
    }
}