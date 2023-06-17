package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(5);
        linkedList.addFirst(9);
        System.out.println("Вывод списка: ");
        linkedList.printList();

        linkedList.addLast(55);
        linkedList.addLast(31);
        linkedList.addLast(39);
        System.out.println("Вывод списка с уже добавленными элементами: ");
        linkedList.printList();

        System.out.println("Проверка на наличие элемента в списке: ");
        System.out.println("linkedList.contains(55) = " + linkedList.contains(55));
        System.out.println("Проверка на наличие элемента в списке: ");
        System.out.println("linkedList.contains(156) = " + linkedList.contains(156));

        linkedList.removeLast();
        System.out.println("Удалили последний элемент из списка: ");
        linkedList.printList();

        linkedList.remove();
        System.out.println("Удалили первый элемент из списка: ");
        linkedList.printList();

        System.out.println("список до разворота: ");
        linkedList.printList();
        System.out.println();
        linkedList.revert();
        System.out.println("развёрнутый список: ");
        linkedList.printList();
    }

}
