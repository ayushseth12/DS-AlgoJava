package ayseth;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ayseth on 08/02/17.
 */
public class LRUCache {

    class Node{

        Node next;
        int data;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        Node insertatend(Node head,int data) {

            if (head == null) {
                Node newnode = new Node();
                newnode.setData(data);
                newnode.setNext(null);
                return newnode;
            }
            Node current = head;
            while (current.getNext() != null)
                current = current.getNext();

            Node newnode = new Node();
            newnode.setData(data);
            newnode.setNext(null);
            current.setNext(newnode);
            return head;
        }
        Node insertathead(Node head,int data){

            if(head==null){
                Node newnode = new Node();
                newnode.setData(data);
                newnode.setNext(null);
                return newnode;
            }
            Node newnode=new Node();
            newnode.setNext(head);
            newnode.setData(data);
            return newnode;
        }

        Node deletefromstart(Node head){

            if(head==null)
                return null;
            Node current=head;
            current=head.getNext();
            head.setNext(null);
            return current;
        }

        Node deletefromend(Node head){

            Node current=head;
            while(current.getNext().getNext()!=null){
                current=current.getNext();
            }
            current.setNext(null);
            return head;
        }
    }
    public Node linkedList;
    public Map map=new HashMap<Integer,Node>();
    public int cacheValue;

    public int getCacheValue() {
        return cacheValue;
    }

    public void setCacheValue(int cacheValue) {
        this.cacheValue = cacheValue;
    }

    public void pagecall(int i){
        if(linkedList==null){
            linkedList.setNext(null);
            linkedList.setData(i);
            map.put(i,linkedList);
            return;
        }
        else {
            if (checkPageinCache(i, linkedList)) {
                if (isCacheFull(linkedList)) {
                    Node current=linkedList;
                    if(linkedList.getData()!=i) {
                        while (current.getNext().getData() == i) {
                            current.setNext(current.getNext().getNext());
                            Node newnode=new Node();
                            newnode.setNext(linkedList);
                            newnode.setData(i);
                            map.put(i,newnode);
                            linkedList=newnode;
                        }
                    }
                }
                Node newnode=new Node();
                newnode.setData(i);
                newnode.setNext(linkedList);
                map.put(i,newnode);
                linkedList=newnode;
            } else {


            }
        }
    }
    boolean checkPageinCache(int i,Node linkedList){

        Node current=linkedList;
        while(current!=null){
            if(current.getData()==i)
                return true;
            current=current.getNext();
        }
        return false;
    }
    boolean isCacheFull(Node linkedList){



    }


}
