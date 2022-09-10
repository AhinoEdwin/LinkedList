import java.util.Scanner;

public class linkedlist{
    static node lhead = null;
    static dnode dhead = null;

    static dnode dtail = null;
    static int snum=0;
    static int dnum=0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        linked list = new linked();
        doublylinked dlist = new doublylinked();
        show display =new show();


        while (true) {
            System.out.println("Enter the choice");
            System.out.println("1.Singly LinkedList");
            System.out.println("2.Doubly LinkedList");
            System.out.println("3.Singly LinkedList Delete");
            System.out.println("4.Doubly LinkedList Delete");
            System.out.println("5.Display Singly LinkedList");
            System.out.println("6.Display Doubly LinkedList");
            System.out.println("7.Display Doubly LinkedList in Reverse");

            int c = sc.nextInt();
            //num=0;

            switch (c) {
                case 1:
                    System.out.println("Enter the Number of Nodes");
                    snum = sc.nextInt();
                    for (int i = 0; i < snum; i++) {
                        int value = sc.nextInt();
                        list.insert(value);
                    }
                    break;

                case 2:
                    System.out.println("Enter the Number of Nodes");
                    dnum = sc.nextInt();
                    for (int i = 0; i < dnum; i++) {
                        int value = sc.nextInt();
                        dlist.insert(value);
                    }
                    break;

                case 3:
                    System.out.println("Enter the value to be deleted");
                    int val = sc.nextInt();
                    int cval=snum;
                    int count =list.search(val,lhead);
                    if (count == cval) {
                        System.out.println("Element Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter the value to be deleted");
                    int dval= sc.nextInt();
                    int d=dnum;
                    int dcount =dlist.search(dval,dhead);
                    if (dcount == d) {
                        System.out.println("Element Not Found");
                    }
                    break;
                case 5:
                    display.show(lhead);
                    break;
                case 6:
                    display.show(dhead);
                    break;
                case 7:
                    display.showrev(dtail);

            }

        }
    }
}
