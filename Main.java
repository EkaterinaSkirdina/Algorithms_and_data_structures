// 1) Необходимо реализовать метод разворота связного односвязного списка односвязного
// 2) Дополнительное реализовать методы для двухсвязного списка (добавление первого/последнего,
//  удаление первого/последнего, вывод, метод разворота)

public class Main {
    
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("Односвязный список");
        list.print();
        System.out.println("\nРазворот");
        list.reverse();
        list.print();
        System.out.println("\n");



    DoublyLinkedList doublyList = new DoublyLinkedList();
    //Добавление в начало
    System.out.println("Двусвязный список\n");
    doublyList.addFirst(0);
    doublyList.addFirst(1);
    doublyList.addFirst(2);
    doublyList.addFirst(3);
    System.out.println("Добавление в начало");
    doublyList.print2();
    System.out.println("\n");

    //Удаление первого элемента
    System.out.println("Удаление первого элемента");
    doublyList.removeFirst();
    doublyList.print2();
    System.out.println("\n");

    //Добавление в конец
    System.out.println("Добавление в конец");
    doublyList.addLast(0);
    doublyList.addLast(1);
    doublyList.addLast(2);
    doublyList.addLast(3);
    doublyList.print2();
    System.out.println("\n");
    
    //Удаление последнего элемента
    // System.out.println("Удаление последнего");
    // doublyList.removeLast2();
    // doublyList.print2();
    // System.out.println();

    //Разворот списка
    System.out.println("Разворот");
    doublyList.reverse();
    doublyList.print2();
    System.out.println("\n");
}

}


