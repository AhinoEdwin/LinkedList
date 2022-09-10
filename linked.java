public class linked {

    int ctr;
    static node head;

    linkedlist obj=new linkedlist();
    public void insert(int data){
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;

        if(head==null){
            head=newnode;
            obj.lhead=head;
        }else{
            node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=newnode;
        }

    }

    public int search(int data,node lhead) {
        ctr=1;
        node n = lhead;
        node prev = null;
        while (n.next != null) {
            if (lhead.data == data) {
                obj.snum--;
                obj.lhead = n.next;
                break;
            } else if (n.data == data) {
                prev.next=n.next;
                obj.snum--;
                break;
            }
            ctr++;
            prev=n;
            n=n.next;
        }
        if(n.next==null && n.data == data){
            obj.snum--;
            prev.next=null;
        }
        return ctr;
    }
}
