package main.java.ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(5);
        linkedList.addFirst(9);
        linkedList.printList();

        linkedList.addLast(55);
        linkedList.addLast(31);
        linkedList.addLast(39);
        linkedList.printList();
    }

}
