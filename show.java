public class show {
    public void show(node head){
        node snode=head;
        while(snode.next!=null){
            System.out.println(snode.data);
            snode=snode.next;
        }
        System.out.println(snode.data);
    }
    public void show(dnode head){
        dnode snode=head;
        while(snode.next!=null){
            System.out.println(snode.data);
            snode=snode.next;
        }
        System.out.println(snode.data);
    }

    public void showrev(dnode dtail){
        dnode tail = dtail;
        while (tail.prev!=null){
            System.out.println(tail.data);
            tail = tail.prev;
        }
        System.out.println(tail.data);

    }
}
