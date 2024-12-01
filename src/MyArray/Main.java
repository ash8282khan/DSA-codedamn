package MyArray;

public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(6);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
//        arr.removeAt(2);
        arr.insert(10);
        arr.insert(11);
        arr.insert(13);
//        arr.insert(0);

        System.out.println(arr);
        System.out.println(arr.indexOf(4));
        System.out.println(arr.max());
        System.out.println(arr.min());
        arr.reverse();
        System.out.println(arr);
    }
}
