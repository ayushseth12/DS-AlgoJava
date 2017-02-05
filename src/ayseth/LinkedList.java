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
    public static void main(String[] args){

        LinkedList head=new LinkedList(0);
        head=head.insert(head,5);
        head=head.insert(head,10);
        head=head.insert(head,15);
        head=head.insert(head,20);
        head=head.insert(head,25);
        head=head.insert(head,30);
        head.printlist(head);
    }



}
