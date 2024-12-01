package MyLinkedList;



class Node {
    public int data;
    public Node next = null;
    public Node(int data){
        this.data=data;
    }
}
public class MyLinkedList {
    private Node head;
    private Node tail;
    public MyLinkedList(){
        head=null;
        tail=null;
    }
    public void insert(int value){
        Node node =new Node(value);
        if (head==null){
            head=tail=node;
        }else{
//            Node current = head;
//            while(current.next != null ){
//                current=current.next;
//            }
//            current.next=node;

            tail.next=node;
            tail=node;
        }
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        if(head==null){
            head=tail=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void insertAt(int index,int value){
        if(head==null) throw new IllegalArgumentException();

        Node node = new Node(value);
        Node current = head;
        Node prev = null;
        while(index>0 && current!=null){
            prev=current;
            current=current.next;
            index--;
        }

        prev.next=node;
        node.next=current;
    }
    public int indexOf(int value){
        int index=0;
        Node current=head;
        while(current!=null){
            if(current.data==value) return index;
            index++;
            current = current.next;
        }
        return -1;
    }
    public void reverse(){
        if (head==null || head.next ==null) return;

        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        head= current;

    }
    public void deleteFromBeg(){
        if(head==null) return;

        Node temp = head;
        head = head.next;
        temp.next=null;
    }
    public void deleteFromEnd(){
        if (head==null) return;
        Node current=head;
        while(current.next!=tail){
            current=current.next;
        }
        current.next=null;
        tail=current;
    }

    void printRec(Node head){
        if(head==null) return;

        System.out.print(head.data+" ");
        printRec(head.next);
    }
    void printRecRev(Node head){
        if(head==null) return;

        printRecRev(head.next);
        System.out.print(head.data+" ");
    }
    void printRec(){
        printRec(head);
    }
    void printRecRev(){
        printRec(head);
    }

    public void deleteNthFromEnd(int n){
        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        int totalnodes=0;
        Node current = head;
        while(current!=null){
            totalnodes++;
            current=current.next;
        }
        int index = totalnodes-n+1;
        Node prev = null;
        current = head;

        while(index>1 && current != null){
            prev= current;
            current=current.next;
            index--;
        }
        prev.next=current.next;
        current.next=null;
    }

    public int sum(){
        Node current = head;
        int sum = 0;
        while (current!=null){
            sum=sum+ current.data;
            current=current.next;
        }
        return sum;
    }
    public String toString(){
        Node current = head;
        StringBuilder result = new StringBuilder();

        while(current!=null){
            result.append(current.data);
            if (current.next!=null)
                result.append(" --> ");
            current=current.next;
        }
        return result.toString();
    }

}
