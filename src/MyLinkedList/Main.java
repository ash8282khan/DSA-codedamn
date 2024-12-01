package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insertFirst(10);
        list.insertAt(5,99);
        list.insertAt(4,9);
//        System.out.println(list);
//        list.deleteFromBeg();
////        list.reverse();
//        list.deleteFromEnd();
//        list.deleteNthFromEnd(5);
//        System.out.println(list);
//
//        int s;
//        s= list.sum();
//        System.out.println(s);
//        System.out.println(list.indexOf(5));

        list.printRecRev();
//        list.printRec();
//        System.out.println(" ");
    }
}
