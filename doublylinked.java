public class doublylinked {
    dnode head;
    dnode tail;

    int ctr=1;
    linkedlist obj = new linkedlist();
    public void insert(int data) {
        dnode newnode=new dnode();
        newnode.data=data;
        newnode.prev=null;
        newnode.next=null;
        if (head == null) {
            head=newnode;
            obj.dhead=head;
        }else {
            dnode dn=head;
            while(dn.next!=null){
                dn=dn.next;
            }
            dn.next=newnode;
            newnode.prev=dn;
            tail=newnode;
            obj.dtail = tail;
        }

    }
    public int search(int data,dnode head){
        dnode n=head;
        dnode p = null;
        while(n.next!=null){
            if(head.data == data){
                obj.snum--;
               obj.dhead=n.next;
               obj.dhead.prev = null;
               break;
            }else if(n.data == data){
                obj.snum--;
                p.next = n.next;
                n.next.prev = n.prev;
                break;
            }
            ctr++;
            p=n;
            n=n.next;
        }
        if(n.next == null && n.data == data){
            obj.snum--;
            p.next= null;
        }
        return ctr;
    }
}

