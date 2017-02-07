package ayseth;

/**
 * Created by ayseth on 05/02/17.
 */
public class LinkedList {

    private int data;
    private LinkedList next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public LinkedList(int data){
        this.data=data;
    }

    LinkedList insert(LinkedList head,int number){
        if(head==null){
            LinkedList head1=new LinkedList(number);
            return head1;
        }else
        {
            LinkedList current=head;
            while (current.getNext()!=null){
                current=current.getNext();
            }
            LinkedList node=new LinkedList(number);
            current.setNext(node);
            return head;
        }
    }

    void printlist(LinkedList head){

        if(head==null) {
            System.out.println("The Linked List is empty");
            return;
        }
        LinkedList current=head;
        while(current!=null){
            System.out.print(current.getData()+"->");
            current=current.getNext();
        }
    }
    //Finding nth node from end.
    int nthnode(LinkedList head,int pos){
        if(head==null){
            System.out.println("Linked list is empty");
            return 0;
        }
        LinkedList node1=head;
        LinkedList node2=head;
        int i=1;
        while(i!=pos){
            node1=node1.getNext();
            i++;
        }
        while (node1.getNext()!=null){

            node1=node1.getNext();
            node2=node2.getNext();
        }
        return node2.getData();
    }

    //reverse a Linked List
    LinkedList reverse(LinkedList head){

        if(head==null){
            System.out.println("The Linked List is Empty");
            return null;
        }
        LinkedList node1=head;
        LinkedList node2=null;
        LinkedList node3=null;
        while(node1!=null){
            node3=node1.getNext();
            node1.setNext(node2);
            node2=node1;
            node1=node3;
        }
        return node2;
    }


    public static void main(String[] args){

        LinkedList head=new LinkedList(0);
        head=head.insert(head,5);
        head=head.insert(head,10);
        head=head.insert(head,15);
        head=head.insert(head,20);
        head=head.insert(head,25);
        head=head.insert(head,30);
        head.printlist(head);
        int i=head.nthnode(head,3);
        System.out.println("The 3rd from end is "+i);
        head=head.reverse(head);
        head.printlist(head);
        i=head.nthnode(head,3);
        System.out.println("The 3rd from end is "+i);
    }



}
